package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	//private LinkedHashMap<String, String> countryOptions;
//	//Inject the property values into your Spring Controller
//	@Value("#{countryOptions}")
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	
	public Student(){
		
		//populate country options: used ISO country code
		countryOptions=new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("GE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US","USA");
	}
	
	
	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	
}