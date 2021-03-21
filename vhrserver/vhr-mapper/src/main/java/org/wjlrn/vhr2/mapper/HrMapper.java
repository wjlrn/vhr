package org.wjlrn.vhr2.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wjlrn.vhr2.model.Hr;
import org.wjlrn.vhr2.model.Role;

import java.util.List;

@Repository
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getHrRolesById(Integer id);

    List<Hr> getAllHrs(@Param("hrid") Integer hrid,@Param("keywords") String keywords);

    List<Hr> getAllHrsExceptCurrentHr(Integer id);
}