package org.wjlrn.vhr2.config;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author wanajinae
 * 判断当前用户是否具备这样的角色
 **/

@Component
public class CustomUrlDecisionManager implements AccessDecisionManager {
    /**
     * 没抛异常说明请求合法，否则不合法
     * @param authentication
     * @param o
     * @param collection
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        for(ConfigAttribute configAttribute:collection){
            String needRole = configAttribute.getAttribute();
            if("ROLB_LOGIN".equals(needRole)){
                if(authentication instanceof AnonymousAuthenticationToken){
                    throw new AccessDeniedException("尚未登录，请登录！");
                }else{
                    return;
                }
            }
            //获取当前用户所具备的角色
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            //遍历当前用户是否具备我们需要的角色，只要有所需要的角色其中一个即可
            for(GrantedAuthority authority:authorities){
                if(authority.getAuthority().equals(needRole)){
                    return;
                }
            }
        }
        throw new AccessDeniedException("权限不足，请联系管理员");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
