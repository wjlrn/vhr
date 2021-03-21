package org.wjlrn.vhr2.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wjlrn.vhr2.model.Employee;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeMapper {
    Employee getEmployeeById(String WorkId);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeeByPage(@Param("page") Integer page,
                                     @Param("size") Integer size,
                                     @Param("emp") Employee employee,
                                     @Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("emp") Employee employee,
                  @Param("beginDateScope") Date[] beginDateScope);

    Integer maxWorkID();

    Integer addEmps(@Param("list") List<Employee> list);

    List<Employee> getEmployeeByPageWithSalary(@Param("page") Integer page,@Param("size") Integer size);

    Integer updateEmployeeSalaryById(@Param("eid") Integer eid,@Param("sid") Integer sid);
}