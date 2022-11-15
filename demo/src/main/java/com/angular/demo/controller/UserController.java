package com.angular.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.demo.entity.Users;
import com.angular.demo.links.UserLinks;
import com.angular.demo.service.UsersService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
    UsersService usersService;
	
    @GetMapping(path = UserLinks.LIST_USERS)
    public ResponseEntity<List<Users>> listUsers() {
       // log.info("UsersController:  list users");
        List<Users> resource = usersService.getUsers();
      
       // System.out.println(resource.get(0).toString());
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = UserLinks.ADD_USER)
	public ResponseEntity<?> saveUser(@RequestBody Users user) {
      //  log.info("UsersController:  list users");
        Users resource = usersService.saveUser(user);
        return ResponseEntity.ok(resource);
    }

}
