package top.tanghaibin.context;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import top.tanghaibin.entity.User;

/**
 * Created by Administrator on 2016/4/18.
 */
public class UserRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = authenticationToken.getPrincipal().toString();
        String password = authenticationToken.getCredentials().toString();
//        if("tanghaibin".equals(user.getUsername()) && "123".equals(user.getPswd())){
//            return new SimpleAuthenticationInfo(user.getUsername(), user.getPswd(), getName());
//        }

        return null;
    }
}
