package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="donar_camp")

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
public class DonarCamp {

	@Id
	@Column(name="campid")
	@SequenceGenerator(name="sequence",initialValue=200)
	int campId;
	
	@Column(name="campname")
    String campName;
	
	@Column(name="campdate")
	LocalDate campDate;
	
	@Column(name="time")
	String time;
	
	@Column(name="address")
	String address;
	
	@Column(name="contactno")
	String contactNo; 
	
	
}
