package com.example.demo.contoller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.Donar;



@Controller
public class DonarContoller {
	
	@Autowired
	private Donar object;
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("majHeading","Blood Donation Camp");
		return "main";
		
	}
	@GetMapping(path="/addDonar")
	public String sendForm(Model model) {
		model.addAttribute("command",object);
		return "addDonar";
	}
	 @PostMapping(path="/addDonar")
	    public String submitForm(@Valid @ModelAttribute("command") Donar donar,BindingResult result) {
	    	String nextStep = "success";
	    	
	    	if(result.hasErrors()) {
	    		nextStep = "addDonar";
	    	}else {
	    		HttpHeaders headers = new HttpHeaders();
	    		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    		headers.setContentType(MediaType.APPLICATION_JSON);
	    		HttpEntity<Donar> requestBody = new HttpEntity<>(donar,headers);
	        	template.postForObject("http://localhost:8080/api/v1/donars", requestBody, Donar.class);
	    	}
	    	return nextStep;
	    }
	    @GetMapping(path = "/getAllDonars")
	    public String findAll(Model model) {
	    Donar[] resp =template.getForObject("http://localhost:8080/api/v1/donars",
	    Donar[].class);
	    model.addAttribute("data",resp);
	    return "showall";
	    }

	
		
		@GetMapping(path="/searchByBloodGroup")
		public String sendFormBlood(Model model)
		{

		model.addAttribute("data",object);
		return "searchByBloodGroup";

		}
		
		@GetMapping(path = "/getDonorByBloodGroup")
		public String findByBloodGroup(@RequestParam("bloodgroup") String bloodgroup, Model model) {

		Donar[] resp =template.getForObject("http://localhost:8080/api/v1/donars/srch/"+bloodgroup,
		Donar[].class);

		model.addAttribute("data",resp);
		
		return "showall";

		}
		@GetMapping(path="/cancelRegistration")
		public String sendDeleteForm(Model model) {
		model.addAttribute("data",object);
		return "cancelRegistration";
		}
		@RequestMapping(path = "/deleteDonorById")
		public ResponseEntity<String> deleteDonorById(@RequestParam("donarId") int donarId, Model model) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Donar> requestBody = new HttpEntity<>( headers);
		ResponseEntity<String> resp = template.exchange("http://localhost:8080/api/v1/donars/"+donarId, HttpMethod.DELETE, requestBody, String.class);
		if(resp.getBody().contains("One Record Deleted")) {
		return ResponseEntity.ok().body("One Donor Deleted");
		}
		else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("OOPS Record Not Found");
		}

		}
		
		
		
		@GetMapping(path="/update")
		public String sendForm4(Model model) {
		model.addAttribute("data",object);
		return "update";
		}
		@RequestMapping(path = "/updateDonorById" )
		public ResponseEntity<String> updateDonorById(@RequestParam("donarId") int donarId,@RequestParam("city") String city, Model model) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Donar> requestBody = new HttpEntity<>( headers);
		ResponseEntity<String> resp = template.exchange("http://localhost:8080/api/v1/donars/"+donarId+"/"+  city , HttpMethod.PUT, requestBody, String.class);
		if(resp.getBody().contains("One Record Updated")) {
			return ResponseEntity.ok().body("One Donor Updated");
			}
			else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("OOPS Record Not Found");
			}


		}
		
		
	}



	    

