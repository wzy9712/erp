package com.wzy.service.impl;

import com.wzy.dao.UserDao;
import com.wzy.domain.User;
import com.wzy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public int userAdd(User user) {
        //用户注册
        return userDao.userAdd(user);
    }

    @Override
    public boolean userSelect(User user) {
        //用户登录
        User user1 = userDao.userSelect(user);
        if (user1.getCount()!=null&&user.getPassword().equals(user1.getPassword())){
            return true;
        }
        return false;
    }
}
