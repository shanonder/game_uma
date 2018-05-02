package com.icday.game.databases.mappers;

import com.icday.game.databases.models.UserDO;

public interface UserDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    UserDO selectByUserName(String userName);

//    @Insert("insert into tb_user(id, user_sex) values(#{id}, #{user_sex})")
//    @SelectKey(keyProperty = "id", resultType = String.class, before = true,
//            statement = "select replace(uuid(), '-', '') as id from dual")
//    int save(UserDO record);
}