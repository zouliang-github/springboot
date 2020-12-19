package com.lcu.service.impl;

import com.lcu.bean.User;
import com.lcu.mapper.UserMapper;
import com.lcu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        return userMapper.selectAll();
    }
}
