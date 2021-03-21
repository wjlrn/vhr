package org.wjlrn.vhr2.Controller.system.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wjlrn.vhr2.model.Hr;
import org.wjlrn.vhr2.model.RespBean;
import org.wjlrn.vhr2.model.Role;
import org.wjlrn.vhr2.service.HrService;
import org.wjlrn.vhr2.service.RoleService;

import java.util.List;

/**
 * @author wanajinae
 **/

@RestController
@RequestMapping("/system/hr")
public class HrController {
    @Autowired
    HrService hrService;
    @Autowired
    RoleService roleService;
    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords){
        return hrService.getAllHrs(keywords);
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr){
        if(hrService.updateHr(hr) == 1){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @PutMapping("/role")
    public RespBean updateHrRole(Integer hrid, Integer[] rids){
        if(hrService.updateHrRole(hrid, rids)){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteHrById(@PathVariable Integer id){
        if(hrService.deleteHrById(id)==1){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
