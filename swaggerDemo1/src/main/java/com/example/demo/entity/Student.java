package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student 
{
	@Id
	@Column(name="S_ID")
	private int id;
	
	@Column(name="S_NAME")
	private String  name;
	
	@Column(name="S_MARKS")
	private double marks;
	
	@Column(name="S_SECTION")
	private char section;
}
