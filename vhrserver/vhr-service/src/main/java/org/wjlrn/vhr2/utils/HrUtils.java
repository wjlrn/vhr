package org.wjlrn.vhr2.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.wjlrn.vhr2.model.Hr;

/**
 * @author wanajinae
 **/

public class HrUtils {
    public static Hr getCurrentHr(){
        return ((Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
