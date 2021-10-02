package com.han.service.impl;

import com.han.moder.User;
import com.han.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("小黑");
        user.setAge(18);

        return user;
    }
}
