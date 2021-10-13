package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name="donar_registration")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Donar {

	@Id //the column with primary key we have to add @Id
	@Column(name="donar_Id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sequence") 
	@SequenceGenerator(name="sequence",initialValue=104)
	
	int donarId;
	
	@Column(name="fullname")
	String fullName;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name="age")
	int age;
	
	@Column(name="bloodgroup")
	String bloodgroup;
	
	@Column(name="lasttimedonated")
	LocalDate lastTimeDonated;
	
	@Column(name="email")
	String email;
	
	@Column(name="phoneno")
	String phoneNo;
	
	@Column(name="city")
	String city;
	
	@Column(name="state")
	String state;

}
