package com.icday.game.databases.mappers;

import com.icday.game.databases.models.GridDO;

public interface GridDOMapper {
    int insert(GridDO record);

    int insertSelective(GridDO record);
}