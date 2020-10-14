package com.nilesh.demo1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nilesh.demo1.model.Student;
import com.nilesh.demo1.service.IStudentService;

@RestController
public class myController {
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/student/{pageNo}/{pageSize}")
	public List<Student> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		return studentService.findPaginated(pageNo, pageSize);
	}
}
