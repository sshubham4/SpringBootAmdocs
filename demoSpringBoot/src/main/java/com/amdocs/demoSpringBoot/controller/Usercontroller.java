package com.amdocs.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.demoSpringBoot.modal.User;
import com.amdocs.demoSpringBoot.repo.UserRepo;
import com.amdocs.demoSpringBoot.service.UserService;

@RestController
public class Usercontroller {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {
		return userService.GetAllUser();

	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.AddUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.UpdateUser(user);

	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
		try {
			userService.DeleteUser(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
