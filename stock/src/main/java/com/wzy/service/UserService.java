package com.wzy.service;

import com.wzy.domain.User;

public interface UserService {
    int userAdd(User user);
    boolean userSelect(User user);
}
