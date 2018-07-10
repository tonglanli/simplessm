package priv.xiaohan.ssm.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import priv.xiaohan.ssm.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import priv.xiaohan.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserByID(userId);
        //绑定对象到User.jsp
        model.addAttribute("user", user);
        return "User";

    }
}