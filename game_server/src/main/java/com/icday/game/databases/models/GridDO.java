package com.icday.game.databases.models;

public class GridDO {
    private String roleId;

    private Integer gridType;

    private Integer gridIndex;

    private String itemId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Integer getGridType() {
        return gridType;
    }

    public void setGridType(Integer gridType) {
        this.gridType = gridType;
    }

    public Integer getGridIndex() {
        return gridIndex;
    }

    public void setGridIndex(Integer gridIndex) {
        this.gridIndex = gridIndex;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }
}