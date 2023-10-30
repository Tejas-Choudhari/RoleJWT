package com.example.RoleJWT.service;
import com.example.RoleJWT.service.RoleService;
import com.example.RoleJWT.dao.RoleDao;
import com.example.RoleJWT.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        // Find role by name using the roleDao
        Role role = roleDao.findRoleByName(name);
        return role;
    }
}
