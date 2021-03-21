package org.wjlrn.vhr2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wjlrn.vhr2.mapper.PoliticsstatusMapper;
import org.wjlrn.vhr2.model.Politicsstatus;

import java.util.List;

/**
 * @author wanajinae
 **/
@Service
public class PoliticsstatusService {
    @Autowired
    PoliticsstatusMapper politicsstatusMapper;
    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
