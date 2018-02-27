package com.coushu.user.service.impl;

import com.coushu.user.mapper.UserMapper;
import com.coushu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shenwenjun on 2018/2/6.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public void call() {
        System.out.println("用户数量为：" + userMapper.getUserCount());
    }

    @Override
    public void send(String message) {
        System.out.println("发送的数据为：" + message);
    }
}
