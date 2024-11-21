package com.shoppersstack_Generic_Utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	
	public int genrateRandomNumber() {
		
	
	Random r = new Random();	
	
	int num = r.nextInt();
	return num;
	}

 public String localDate() {
	  String value = LocalDate.now().toString().replace("-","");
	  return value;
	  
 }
 public String dateAndTime() {
	 String time = LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
	 return time;
 }
 }