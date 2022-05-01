package com.example.demo.service.impl;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public User getUserInfo(){
        User user = new User();
        user.setName("jack");
        user.setPassword(12341234);
        return user;
    }
}
