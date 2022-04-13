package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Example;
import com.example.repository.Example_Repository;
import com.example.service.Example_Service;

@Service

public class Example_ServiceImpl implements Example_Service{
@Autowired
	private Example_Repository exampleRepository;
	@Override
	public void saveExample(Integer id, String name, Integer age, String email, String password) {
		
		Example example=new Example();
		example.setId(id);
		example.setName(name);
		example.setAge(age);
		example.setEmail(email);
		example.setPassword(password);
		example.setActive(true);
		exampleRepository.save(example);
	}

}
