package com.howtodoinjava.demo.spring.controller;

import org.springframework.ui.Model;

import java.util.Locale;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
// this is a controller class
public class HomeController
{
	// attack /home endpoint
	public String homeInit(Locale locale, Model model) {
		return "home";
	}
}
