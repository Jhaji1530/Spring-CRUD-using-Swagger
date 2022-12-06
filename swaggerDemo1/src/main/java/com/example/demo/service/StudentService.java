package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.swaggerRepository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student addStudent(Student student)
	{
		if(studentRepository.existsById(student.getId()))
		{
			System.out.println("Faculty record already exist");
			return null;
		}
		else
		{
			System.out.println("Value Inserted");
			return studentRepository.save(student);
		}
	}
	

	public Student updateStudent(Student student)
	{
		if(studentRepository.existsById(student.getId()))
		{
			System.out.println("Record updated successfully");
			return studentRepository.save(student);
		}
		else
		{
			System.out.println("Student does not exist");
			return null;
		}
	}
	
	public String deleteStudentById(int id)
	{
		studentRepository.deleteById(id);
		return "Delete request completed";
	}
	
	public List<Student> getStudents(int id)
	{
		return studentRepository.findAll();
	}
}
