package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonarCamp;
import com.example.demo.service.DonarCampService;

@RestController
@RequestMapping(path="/api/v1/camps")
public class DonarCampController {
	@Autowired
	private DonarCampService service;
	
	
	@GetMapping
	public List<DonarCamp> getAll(){
		return this.service.findAlll();
	}
	@PostMapping
	public ResponseEntity<DonarCamp> addDonarCamp(@RequestBody DonarCamp entity){
		
		DonarCamp addedEntity = this.service.addDonarCamp(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
		
	}
	
	
	 @PutMapping(path="/{campId}/{address}")
		public ResponseEntity<String> updateAddress(@PathVariable("campId") int campId,
				@PathVariable("address")String address){
			 int count = this.service.updateAddress(campId, address);
			 return ResponseEntity.ok().body(count+":=Records Updated");
		 }
		 
	@DeleteMapping(path="/{campId}")
	public ResponseEntity<String> removeCamp(@PathVariable("campId") int campId){
		int count = this.service.delete(campId);
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message="Record Not Found";
		if(count==1) {
			status=HttpStatus.OK;
			message="One Record Deleted";
			
		}
		return ResponseEntity.status(status).body(message);
		
}
}