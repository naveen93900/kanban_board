package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/std")
	@PreAuthorize("hasAuthority('USER')")
	public List<String> findAllStudents(){
		return new ArrayList<>() {{add("Rakshesh");add("Ramesh");add("Rakesh");add("Rajesh");}};
	}
	
	@GetMapping("/emp")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<String> findAllEmployees(){
		return new ArrayList<>() {{add("Allen");add("Martin");add("Scott");add("King");add("Jones");add("Smith");}};
	}
	
}
