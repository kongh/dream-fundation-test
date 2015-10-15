package com.coder.dream.data.dao.model.user;

import com.coder.dream.base.data.dao.model.BaseEntity;


public class User extends BaseEntity{

    private String name;

    private String comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
