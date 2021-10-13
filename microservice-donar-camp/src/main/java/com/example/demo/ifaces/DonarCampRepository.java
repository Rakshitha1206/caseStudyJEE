package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.DonarCamp;

@Repository
public interface DonarCampRepository extends JpaRepository<DonarCamp,Integer>  {

	@Query(nativeQuery = true, value ="update donar_camp set address=:newAddress where campID=:number")
	@Modifying
	@Transactional 
	public int updateAddress(@Param("number") int campId, @Param("newAddress") String address);
}
