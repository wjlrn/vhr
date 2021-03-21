package org.wjlrn.vhr2.mapper;

import org.springframework.stereotype.Repository;
import org.wjlrn.vhr2.model.Nation;

import java.util.List;

@Repository
public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);

    List<Nation> getAllNations();
}