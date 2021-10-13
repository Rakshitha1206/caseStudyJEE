package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Donar;

import com.example.demo.service.DonarService;


@RestController
@RequestMapping(path="/api/v1/donars")
public class DonarContoller {
	
	
	private DonarService service;
	@Autowired
	public void setService(DonarService service) {
		this.service=service;
	}
	
	
	@GetMapping
	public List<Donar> getAll(){
		return this.service.findAll();
		
	}
	
	@GetMapping(path="/srch/{bloodgroup}")
	public List<Donar> findBloodgroup(@PathVariable("bloodgroup") String bloodgroup){
		return this.service.findBloodgroup(bloodgroup);
	}
	
	@PostMapping
	public ResponseEntity<Donar> addDonar(@RequestBody Donar entity)
	{
		Donar addedEntity = this.service.addDonar(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
		
	}
	
	
	 @PutMapping(path="/{donarId}/{city}")
		public ResponseEntity<String> updateCity(@PathVariable("donarId") int donarId,
				@PathVariable("city")String city){
			 int count = this.service.updateCity(donarId, city);
			 return ResponseEntity.ok().body(count+":=Records Updated");
		 }
		 
	
	@DeleteMapping(path="/{donarId}")
	public ResponseEntity<String> removeDonar(@PathVariable("donarId") int donarId){
		int count = this.service.delete(donarId);
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message="Record Not Found";
		if(count==1) {
			status=HttpStatus.OK;
			message="One Record Deleted";
			
		}
		return ResponseEntity.status(status).body(message);
		
		
	}
	
	
}

