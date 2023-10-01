package com.springboot.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.instagram.model.Users;

public interface UsersRepository extends JpaRepository<Users,String>{

}
