package com.icday.game.services.impl;

import com.icday.game.databases.mappers.UserDOMapper;
import com.icday.game.databases.models.UserDO;
import com.icday.game.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(UserDO user) {
        return userMapper.insert(user);
    }

    public UserDO getUserByUserName(String userName){
        return userMapper.selectByUserName(userName);
    }

//    /*
//     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
//     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
//     * pageNum 开始页数
//     * pageSize 每页显示的数据条数
//     * */
//    @Override
//    public List<User> findAllUser(int pageNum, int pageSize) {
//        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        PageHelper.startPage(pageNum, pageSize);
//        return userMapper.selectAllUser();
//    }
}
