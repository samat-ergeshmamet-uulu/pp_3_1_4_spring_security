package com.spring_security.Service;

import com.spring_security.Model.Role;
import java.util.List;
import java.util.Set;

public interface RoleService {
    public Set<Role> findRoles(List<Long> roles);
    public List<Role> getAllRoles();
}
