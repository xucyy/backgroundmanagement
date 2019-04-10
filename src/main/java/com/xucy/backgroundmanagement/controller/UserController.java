package com.xucy.backgroundmanagement.controller;

import com.xucy.backgroundmanagement.domin.User;
import com.xucy.backgroundmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author xucy
 * @Date 2019-04-09 20:21
 * @Description
 **/
@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<User> selectAll(){
        Map map =new HashMap();
        List<User> users=userService.select(map);
        return users;
    }
}
