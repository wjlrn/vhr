package org.wjlrn.vhr2.Controller.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjlrn.vhr2.model.Menu;
import org.wjlrn.vhr2.service.MenuService;

import java.util.List;

/**
 * @author wanajinae
 **/
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenuByHrId(){
        return menuService.getMenuByHrId();
    }
}
