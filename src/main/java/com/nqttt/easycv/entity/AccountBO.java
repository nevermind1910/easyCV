package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "easy_cv", catalog = "")
public class AccountBO {
    private Integer accountId;
    private String username;
    private String password;
    private String email;
    private String phonenumber;
    private String role;

    @Id
    @Column(name = "account_id")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountBO accountBO = (AccountBO) o;
        return Objects.equals(accountId, accountBO.accountId) &&
                Objects.equals(username, accountBO.username) &&
                Objects.equals(password, accountBO.password) &&
                Objects.equals(email, accountBO.email) &&
                Objects.equals(phonenumber, accountBO.phonenumber) &&
                Objects.equals(role, accountBO.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountId, username, password, email, phonenumber, role);
    }
}
