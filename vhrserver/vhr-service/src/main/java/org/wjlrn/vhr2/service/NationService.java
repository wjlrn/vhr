package org.wjlrn.vhr2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wjlrn.vhr2.mapper.NationMapper;
import org.wjlrn.vhr2.model.Nation;

import java.util.List;

/**
 * @author wanajinae
 **/

@Service
public class NationService {
    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
