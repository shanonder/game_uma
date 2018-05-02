package com.icday.game.services;


import com.icday.game.databases.models.UserDO;

public interface UserService {
    int addUser(UserDO user);
    UserDO getUserByUserName(String userName);
}
