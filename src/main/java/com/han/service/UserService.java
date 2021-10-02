package com.han.service;

import com.han.moder.User;

public interface UserService {
    /**
     * 根据用户表示获取用户信息
     */
    User queryUserById(Integer id);
}
