package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		//create a new student object
		Student theStudent=new Student();
		
		//add that student object as the student attribute
		theModel.addAttribute("student",theStudent);
		
		//add the country options to the Spring MVC model
//		theModel.addAttribute("theCountryOptions", countryOptions);
		return "studentForm";
	}
	
	//process form method
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		//log the input data
		System.out.println("theStudent: "+theStudent.getFirstName());
		System.out.println("theStudent: "+theStudent.getLastName());
		return "studentConfirmation";
	}
	

}
