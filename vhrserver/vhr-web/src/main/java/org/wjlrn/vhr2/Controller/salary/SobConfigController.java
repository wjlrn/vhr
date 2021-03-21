package org.wjlrn.vhr2.Controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wjlrn.vhr2.model.Employee;
import org.wjlrn.vhr2.model.RespBean;
import org.wjlrn.vhr2.model.RespPageBean;
import org.wjlrn.vhr2.model.Salary;
import org.wjlrn.vhr2.service.EmployeeService;
import org.wjlrn.vhr2.service.SalaryService;

import java.util.List;

/**
 * @author wanajinae
 **/

@RestController
@RequestMapping("/salary/sobcfg")
public class SobConfigController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    SalaryService salaryService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        return employeeService.getEmployeeByPageWithSalary(page, size);
    }

    @GetMapping("/salaries")
    public List<Salary> getAllSalaries(){
        return salaryService.getAllSalaries();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid){
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if(result==1 || result == 2){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
