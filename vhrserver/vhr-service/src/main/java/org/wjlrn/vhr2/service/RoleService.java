package org.wjlrn.vhr2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wjlrn.vhr2.mapper.RoleMapper;
import org.wjlrn.vhr2.model.Menu;
import org.wjlrn.vhr2.model.Role;

import java.util.List;

/**
 * @author wanajinae
 **/
@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }


    public Integer addRole(Role role) {
        if(!role.getName().startsWith("ROLE_")){
            role.setName("ROLE_"+role.getName());
        }
        return roleMapper.insert(role);
    }

    public Integer deleteRoleById(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
