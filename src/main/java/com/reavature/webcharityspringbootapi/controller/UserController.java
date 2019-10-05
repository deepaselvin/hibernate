package com.reavature.webcharityspringbootapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reavature.webcharityspringbootapi.model.User;
import com.reavature.webcharityspringbootapi.service.UserService;

@RestController
@RequestMapping("Users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/register")
    public @ResponseBody void register(@RequestParam("name")String name,
            @RequestParam("phoneno") String phoneno) {
        System.out.println("UserController->save");
        User user = new User();
        user.setName(name);
        user.setPhone_no(phoneno);
        
      
        userService.registerUser(user);
        
    }
    
    @GetMapping("/list")
    public List<User> list() {
    	return userService.list();
    }
}