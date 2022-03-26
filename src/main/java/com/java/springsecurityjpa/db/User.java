package com.java.springsecurityjpa.db;

import javax.persistence.*;

@Entity
@Table(name="test_user_jpa")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int Id;
    private String userName;
    private String password;
    private Boolean active;
    private String roles;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserNameM(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
