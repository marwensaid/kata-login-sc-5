package com.howtodoinjava.demo.spring.dao;

import java.util.List;

import com.howtodoinjava.demo.spring.model.User;

public interface UserDao {

   // create a save methode : save user

   // create a list methode to list user
   void save(User user);
   List<User> list();
}
