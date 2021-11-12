package com.howtodoinjava.demo.spring.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
// controller Class
public class LoginController {


    // create loginPage method
    // attack /login page with GET method
    // this is a login page : show error message when  something is wrong or we logout
    // then return login
  


    // create logoutPage method
    // impl authentication here and redirect to loginPage
    // check if context is logouted
}
