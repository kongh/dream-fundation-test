package com.coder.dream.dao.model.user;

import com.coder.dream.base.dao.model.BaseEntity;

import java.util.Date;


public class User extends BaseEntity{

    private Integer id;

    private String name;

    private String comments;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
//        StringBuffer buffer = new StringBuffer();
//        Field[] fields = this.getClass().getDeclaredFields();
//        if(fields != null && fields.length > 0){
//            for (int i = 0; i < fields.length; i++) {
//                Field field = fields[i];
//                field.get
//            }
//        }
        return super.toString();
    }
}
