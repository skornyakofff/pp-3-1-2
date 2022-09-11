package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();
    Role getRoleById(int id);
    void createRole(Role role);
    void updateRole(Role role);
    void deleteRoleById(int id);

}
