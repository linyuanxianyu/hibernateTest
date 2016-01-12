package com.test;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by wangjiguang on 16/1/11.
 */
@Entity
@Table(name = "users", schema = "", catalog = "blog")
public class UsersBean implements Serializable {
    private int id;
    private String name;
    private String email;
    private String password;
    private String rememberToken;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "remember_token")
    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersBean usersBean = (UsersBean) o;

        if (id != usersBean.id) return false;
        if (name != null ? !name.equals(usersBean.name) : usersBean.name != null) return false;
        if (email != null ? !email.equals(usersBean.email) : usersBean.email != null) return false;
        if (password != null ? !password.equals(usersBean.password) : usersBean.password != null) return false;
        if (rememberToken != null ? !rememberToken.equals(usersBean.rememberToken) : usersBean.rememberToken != null)
            return false;
        if (createdAt != null ? !createdAt.equals(usersBean.createdAt) : usersBean.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(usersBean.updatedAt) : usersBean.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (rememberToken != null ? rememberToken.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
