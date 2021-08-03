package com.amdocs.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.demoSpringBoot.modal.User;
import com.amdocs.demoSpringBoot.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User AddUser(User user) {
		return userRepo.save(user);

	}
	
	public List<User> GetAllUser() {
		return userRepo.findAll();
	}

	public  User UpdateUser(User user) {
		return userRepo.save(user);
	}
	
	public  void DeleteUser(Long id) {
		 userRepo.deleteById(id);
	}
}
