package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController 	
{
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		return  studentService.deleteStudentById(id);
	}
	
	@GetMapping("/findAll/{id}")
	public List<Student> allStudents(@PathVariable int id)
	{
		return studentService.getStudents(id);
	}
}
