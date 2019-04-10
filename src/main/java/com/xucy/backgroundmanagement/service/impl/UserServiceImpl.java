package com.xucy.backgroundmanagement.service.impl;

import com.xucy.backgroundmanagement.domin.User;
import com.xucy.backgroundmanagement.mapper.UserMapper;
import com.xucy.backgroundmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author xucy
 * @Date 2019-04-09 20:27
 * @Description
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> select(Map map) {
        return userMapper.select(map);
    }
}
