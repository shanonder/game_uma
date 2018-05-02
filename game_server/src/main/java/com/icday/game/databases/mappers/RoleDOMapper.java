package com.icday.game.databases.mappers;

import com.icday.game.databases.models.RoleDO;

public interface RoleDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleDO record);

    int insertSelective(RoleDO record);

    RoleDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleDO record);

    int updateByPrimaryKeyWithBLOBs(RoleDO record);

    int updateByPrimaryKey(RoleDO record);
}