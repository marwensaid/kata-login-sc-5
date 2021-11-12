package com.howtodoinjava.demo.spring.controller;

import com.howtodoinjava.demo.spring.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;

// controller Class
public class UserController {


	// auto-inject UserService


	// in "/" we have our user form


	
	@ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }



	// in "/addUser" we gonna check if we have same error, add user and redirect to "/" after save (this is a POST method)

}
