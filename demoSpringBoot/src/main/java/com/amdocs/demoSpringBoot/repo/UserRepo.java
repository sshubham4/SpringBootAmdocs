package com.amdocs.demoSpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.demoSpringBoot.modal.User;

public interface  UserRepo extends JpaRepository<User, Long>{

}
