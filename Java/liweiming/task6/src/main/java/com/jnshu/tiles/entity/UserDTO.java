package com.jnshu.tiles.entity;

/**
 * @program: Tiles
 * @description: 数据传输类
 * @author: Mr.Lee
 * @create: 2018-07-04 00:45
 **/
public class UserDTO {
    private Integer id;
    private String username;
    private String password;


    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}