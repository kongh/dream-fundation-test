package com.coder.dream.web.vo.user;

import com.coder.dream.base.web.vo.BaseVo;

import java.util.Date;

public class UserVo extends BaseVo{

    private String name;

    private Date updateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
