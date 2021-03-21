package org.wjlrn.vhr2.mapper;

import org.springframework.stereotype.Repository;
import org.wjlrn.vhr2.model.Politicsstatus;

import java.util.List;

@Repository
public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    int insertSelective(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Politicsstatus record);

    int updateByPrimaryKey(Politicsstatus record);

    List<Politicsstatus> getAllPoliticsstatus();
}