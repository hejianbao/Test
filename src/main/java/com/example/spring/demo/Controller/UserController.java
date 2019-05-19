package com.example.spring.demo.Controller;

import com.example.spring.demo.Entity.User;
import com.example.spring.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    @Qualifier("userService")
    UserService userService;
    @RequestMapping(value = "/hello")
    public List<User> helloWorld() {
        return userService.getAllUser();
    }
}
