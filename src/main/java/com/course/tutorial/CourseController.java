package com.course.tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	

	
	
	@RequestMapping("/")
	public String get()
	{
		
		return "index";
	}
	
	

}
