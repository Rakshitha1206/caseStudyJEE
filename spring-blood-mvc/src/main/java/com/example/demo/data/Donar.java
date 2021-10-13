package com.example.demo.data;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;



@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Component

public class Donar {
	

	
	int donarId;
	String fullName;
	String gender;
	@Range(min = 18,max = 60 ,message = "To donate blood age should between 18 and 60")
	int age;
	String bloodgroup;
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate lastTimeDonated;
	String email;
	String phoneNo;
	String city;			
	String state;

}
