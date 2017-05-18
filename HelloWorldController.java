package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//create a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	//need a new controller method to read the form data
	// add data to the model

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		//Read the request parameter from the html form
		String theName=request.getParameter("studentName");
		
		//Convert the data to all upper case
		theName=theName.toUpperCase();
		
		//create the message
		String result="Yo! "+theName;
		
		// add the message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	//add request param instead of httpservletrequest
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
				
		//Convert the data to all upper case
		theName=theName.toUpperCase();
		
		//create the message
		String result="HeyBaby! "+theName;
		
		// add the message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}