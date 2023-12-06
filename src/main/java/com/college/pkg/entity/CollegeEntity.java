package com.college.pkg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CollegeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;  //0
	private String firstName;
	private String lastName;
	private String courseNme; //null
	private String age;
	private String emailId;
	private String phNo;
	private String conDate;
	private String conTime;
	
	
}
