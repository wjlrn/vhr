package org.wjlrn.vhr2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjlrn.vhr2.model.Hr;
import org.wjlrn.vhr2.service.HrService;

import java.util.List;

/**
 * @author wanajinae
 **/

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    HrService hrService;

    @GetMapping("/hrs")
    public List<Hr> getAllHrs(){
        return hrService.getAllHrsExceptCurrentHr();
    }
}
