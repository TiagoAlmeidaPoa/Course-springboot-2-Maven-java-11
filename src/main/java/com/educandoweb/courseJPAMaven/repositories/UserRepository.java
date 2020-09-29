package com.educandoweb.courseJPAMaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJPAMaven.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
