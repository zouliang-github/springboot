package com.lcu.controller;

import com.lcu.bean.User;
import com.lcu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("test.do")
    public String selectUser(Model model){
        List<User> users=userService.selectUser();
        model.addAttribute("users",users);
        return "user";
    }
}

