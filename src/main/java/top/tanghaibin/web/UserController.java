package top.tanghaibin.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.tanghaibin.entity.User;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2016/4/18.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    public String login(User user,HttpServletRequest request){
        Subject subject = SecurityUtils.getSubject();
       subject.logout();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        usernamePasswordToken.setUsername(user.getUsername());
        usernamePasswordToken.setPassword(user.getPswd().toCharArray());
        subject.login(usernamePasswordToken);
        return "main";
    }

    @RequestMapping("delete")
    @RequiresPermissions("user:delete")
    public @ResponseBody String delete(){
        return "delete done......";
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    public @ResponseBody String add(){
        return "add done......";
    }
}
