package org.wjlrn.vhr2.Controller.system.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wjlrn.vhr2.model.JobLevel;
import org.wjlrn.vhr2.model.RespBean;
import org.wjlrn.vhr2.service.JobLevelService;

import java.util.List;

/**
 * @author wanajinae
 **/

@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    JobLevelService jobLevelService;

    @GetMapping("/")
    public List<JobLevel> getAllJobLevels(){
        return jobLevelService.getAllJobLevels();
    }

    @PostMapping("/")
    public RespBean addJobLevel(@RequestBody JobLevel jobLevel){
        if(jobLevelService.addJobLevel(jobLevel)==1){
            return RespBean.ok("添加职称成功");
        }
        return RespBean.error("添加职称失败");
    }

    @PutMapping("/")
    public RespBean updateJobLevelById(@RequestBody JobLevel jobLevel){
        if(jobLevelService.updateJobLevelById(jobLevel)==1){
            return RespBean.ok("更新职称成功");
        }
        return RespBean.error("更新职称失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteJobLevelById(@PathVariable Integer id){
        if(jobLevelService.deleteJobLevelById(id)==1){
            return RespBean.ok("删除职称成功");
        }
        return RespBean.error("删除职称失败");
    }

    @DeleteMapping("/")
    public RespBean deleteJobLevelsByIds(Integer[] ids){
        if(jobLevelService.deleteJobLevelsByIds(ids) == ids.length){
            return RespBean.ok("批量删除职称成功");
        }
        return RespBean.error("批量删除职称失败");
    }
}
