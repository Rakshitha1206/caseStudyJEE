package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donar;
import com.example.demo.ifaces.DonarRepository;


@Service
public class DonarService {

	@Autowired
	private DonarRepository  repo;
	
	public List<Donar> findAll(){
		return this.repo.findAll();
	}
	public Donar addDonar(Donar entity) {
		return this.repo.save(entity);
	}
	
	public List<Donar> findBloodgroup(String bloodgroup){
		return this.repo.findByBloodgroup(bloodgroup);
	}
//	public Donar findById(Integer key) {
//		return this.repo.findById(key).orElseThrow(() -> new RuntimeException("Id not found"));
//	}
	
	public int updateCity(int donarId,String city) {
		return this.repo.updateCity(donarId, city);
	}
	public int delete(int donarId) {
		int rowDeleted =0;
		if(this.repo.existsById(donarId)) {
			this.repo.deleteById(donarId);
			rowDeleted=1;
		}
		
		return rowDeleted;
		
	}
	
}
