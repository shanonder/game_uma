package com.icday.game;

import com.icday.game.databases.models.UserDO;
import com.icday.game.services.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.icday.game.databases.mappers")
public class GameServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameServerApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @Autowired
    public void initDefault(){
        if(userService.getUserByUserName("admin") == null){
            UserDO user = new UserDO();
            user.setUserName("admin");
            user.setPassword("111111");
            userService.addUser(user);
        }

    }



}
