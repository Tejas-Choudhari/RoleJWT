package com.example.RoleJWT.service;


// Importing the Role model
import com.example.RoleJWT.model.Role;
// Declaring the RoleService interface
public interface RoleService {
    // Method to find a Role by its name
    Role findByName(String name);
}
