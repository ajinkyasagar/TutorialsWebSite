package com.course.tutorial;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerRestController {
	@Autowired
	CustomerRepository repository;
	@RequestMapping(value="/get")
	
	public @ResponseBody Customer getc()
	{
		Consumer<? super Customer> c = System.out::println;
		repository.findByLastName("Bauer").forEach(System.out::println);;
		 List<Customer> customers=repository.findByLastName("Bauer");
		
		 Customer customer= new Customer("aasd", "adsfadsf");
		 return customer;
	}
	
@RequestMapping(value="/put",produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	
	public String put()
	{
		
		return "abc";
	}
}
