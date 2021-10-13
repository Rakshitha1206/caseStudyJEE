package com.example.demo.contoller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.Donar;
import com.example.demo.data.DonarCamp;

@Controller
public class CampController {

	@Autowired
	private DonarCamp object;
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private RestTemplate template;

	@GetMapping(path="/addCamp")
	public String sendCampForm(Model model) {
		model.addAttribute("command",object);
		return "addCamp";
	}
	 @PostMapping(path="/addCamp")
	    public String submitCampForm(@Valid @ModelAttribute("command") DonarCamp camp,BindingResult result) {
	    	String nextStep = "campsuccess";
	    	
	    	if(result.hasErrors()) {
	    		nextStep = "addCamp";
	    	}else {
	    		HttpHeaders headers = new HttpHeaders();
	    		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    		headers.setContentType(MediaType.APPLICATION_JSON);
	    		HttpEntity<DonarCamp> requestBody = new HttpEntity<>(camp,headers);
	        	template.postForObject("http://localhost:6060/api/v1/camps", requestBody, DonarCamp.class);
	    	}
	    	return nextStep;
	    }
	    @GetMapping(path = "/getAllCamps")
	    public String findAll(Model model) {
	    DonarCamp[] resp =template.getForObject("http://localhost:6060/api/v1/camps",
	    DonarCamp[].class);
	    model.addAttribute("data",resp);
	    return "showCamps";
	    }
}
