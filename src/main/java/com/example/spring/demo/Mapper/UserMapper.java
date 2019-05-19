package com.example.spring.demo.Mapper;


import com.example.spring.demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserMapper {
     List<User> getAllUser();
}
