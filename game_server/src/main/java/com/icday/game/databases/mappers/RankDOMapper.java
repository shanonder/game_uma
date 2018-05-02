package com.icday.game.databases.mappers;

import com.icday.game.databases.models.RankDO;

public interface RankDOMapper {
    int insert(RankDO record);

    int insertSelective(RankDO record);
}