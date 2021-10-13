package com.example.demo.ifaces;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Donar;

@Repository
public interface DonarRepository extends JpaRepository<Donar, Integer>{

	public List<Donar> findByBloodgroup(String srchBlood);
	
	@Query(nativeQuery = true, value="update donar_registration set city=:newCity where donar_Id=:number")
	@Modifying
	@Transactional
	public int updateCity(@Param("number") int donarId,@Param("newCity") String city);
	
}
