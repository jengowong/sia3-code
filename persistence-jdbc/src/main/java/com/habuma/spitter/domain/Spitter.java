package com.habuma.spitter.domain;

import java.util.List;

/**
 * 唾沫人
 */
public class Spitter {

    private Long id;                 //唾沫人id
    private String username;         //唾沫人用户名
    private String password;         //唾沫人密码
    private String fullName;         //唾沫人全名
    private List<Spittle> spittles;  //唾沫记录
    private String email;            //邮箱
    private boolean updateByEmail;   //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSpittles(List<Spittle> spittles) {
        this.spittles = spittles;
    }

    public List<Spittle> getSpittles() {
        return spittles;
    }

    public void setUpdateByEmail(boolean updateByEmail) {
        this.updateByEmail = updateByEmail;
    }

    public boolean isUpdateByEmail() {
        return updateByEmail;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Spitter) {
            Spitter other = (Spitter) obj;
            return other.fullName.equals(fullName) &&
                    other.username.equals(username) &&
                    other.password.equals(password);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
