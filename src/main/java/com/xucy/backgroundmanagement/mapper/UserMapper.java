package com.xucy.backgroundmanagement.mapper;

import com.xucy.backgroundmanagement.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author xucy
 * @Date 2019-04-09 20:22
 * @Description
 **/
@Mapper
public interface UserMapper {

    List<User> select(Map map);
}
