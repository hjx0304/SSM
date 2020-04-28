package com.hjx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2020-04-27 16:16:39
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -54717113296470268L;

    private Integer id;

    private String name;

    private String password;


    private Date createTime;
    private Date updateTime;
    private Date accessTime;
    private boolean deleteFlag;
    private String remark;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}