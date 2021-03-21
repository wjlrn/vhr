package org.wjlrn.vhr2.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjlrn.vhr2.model.RespBean;

/**
 * @author wanajinae
 **/
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录");
    }
}
