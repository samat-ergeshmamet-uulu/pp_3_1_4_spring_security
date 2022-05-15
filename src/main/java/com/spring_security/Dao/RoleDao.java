package com.spring_security.Dao;

import com.spring_security.Model.Role;
import java.util.List;
import java.util.Set;

public interface RoleDao {
    public Set<Role> findRoles(List<Long> roles);
    public List<Role> getAllRoles();
}