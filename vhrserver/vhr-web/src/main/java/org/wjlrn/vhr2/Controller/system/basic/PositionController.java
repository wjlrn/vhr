package org.wjlrn.vhr2.Controller.system.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wjlrn.vhr2.model.Position;
import org.wjlrn.vhr2.model.RespBean;
import org.wjlrn.vhr2.service.PositionService;

import java.util.List;

/**
 * @author wanajinae
 **/
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        if(positionService.addPosition(position) == 1){
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @PutMapping("/")
    public RespBean updatePositions(@RequestBody Position position){
        if(positionService.updatePositions(position)== 1){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePositionById(@PathVariable Integer id){
        if(positionService.deletePositionById(id)==1){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if(positionService.deletePositionByIds(ids) == ids.length){
            return RespBean.ok("删除" + ids.length+"个职位成功");
        }
        return RespBean.error("删除失败");
    }
}
