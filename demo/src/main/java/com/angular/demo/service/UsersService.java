package com.angular.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.angular.demo.entity.Users;
import com.angular.demo.repository.UsersRepository;

@Component
public class UsersService {
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
    
    public Users saveUser(Users users) {
    	return usersRepository.save(users);
    }

}
