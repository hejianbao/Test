package com.example.spring.demo.Service;

import com.example.spring.demo.Entity.User;
import com.example.spring.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    public UserMapper userMapper;
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
