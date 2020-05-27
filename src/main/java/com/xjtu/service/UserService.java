package com.xjtu.service;

import com.xjtu.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
