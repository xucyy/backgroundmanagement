package com.xucy.backgroundmanagement.service;

import com.xucy.backgroundmanagement.domin.User;

import java.util.List;
import java.util.Map;

/**
 * @Author xucy
 * @Date 2019-04-09 20:25
 * @Description
 **/

public interface UserService {

    List<User> select(Map map);
}
