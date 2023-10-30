package com.example.RoleJWT.service;

import com.example.RoleJWT.model.User;
import com.example.RoleJWT.model.UserDto;

import java.util.List;

public interface UserService {

    // Saves a user
    User save(UserDto user);

    // Retrieves all users
    List<User> findAll();

    // Retrieves a user by username
    User findOne(String username);

    User createEmployee(UserDto user);

}
