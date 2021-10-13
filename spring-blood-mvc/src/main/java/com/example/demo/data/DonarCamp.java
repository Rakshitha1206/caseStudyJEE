package com.example.demo.data;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component

public class DonarCamp {

    int campId;
	
    String campName;
	
	LocalDate campDate;

	String time;

	String address;

	String contactNo; 
}
