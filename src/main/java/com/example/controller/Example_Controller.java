package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Example_Service;

@RestController
@RequestMapping("/example")
public class Example_Controller {
@Autowired
	private Example_Service exampleService;
@PostMapping("/save-employe")
	public String saveExample_Controller(@RequestParam Integer id,@RequestParam String name,
			@RequestParam Integer age,@RequestParam String email,@RequestParam String password) {
		exampleService.saveExample(id,name,age,email,password);
		return "Sucess";
	}
}
