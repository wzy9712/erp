package com.wzy.dao;

import com.wzy.domain.User;

public interface UserDao {
    int userAdd(User user);
    User userSelect(User user);
}
