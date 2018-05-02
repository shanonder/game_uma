package com.icday.game.databases.mappers;

import com.icday.game.databases.models.ItemDO;

public interface ItemDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemDO record);

    int insertSelective(ItemDO record);

    ItemDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemDO record);

    int updateByPrimaryKeyWithBLOBs(ItemDO record);

    int updateByPrimaryKey(ItemDO record);
}