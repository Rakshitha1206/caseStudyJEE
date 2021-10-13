package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonarCamp;
import com.example.demo.ifaces.DonarCampRepository;

@Service
public class DonarCampService {

	@Autowired
	private DonarCampRepository repo;
	
	public List<DonarCamp> findAlll(){
		return this.repo.findAll();
		
	}
	public DonarCamp addDonarCamp(DonarCamp entity) {
		return this.repo.save(entity);
	}
	public int updateAddress(int campId,String address) {
		return this.repo.updateAddress(campId, address);
	}
	
	public int delete(int campId) {
		int rowDeletd=0;
		if(this.repo.existsById(campId)) {
			this.repo.deleteById(campId);
			rowDeletd=1;
		}
		return rowDeletd;
	}
}
