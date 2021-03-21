package org.wjlrn.vhr2.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wjlrn.vhr2.model.MenuRole;

@Repository
public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);

    void deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid,@Param("mids") Integer[] mids);
}