package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "easy_cv", catalog = "")
public class UserBO {
    private Integer userId;
    private String accountId;
    private String addresss;
    private Date birthday;
    private String name;
    private String avatar;
    private Integer gender;
    private Integer majorId;
    private Integer qualification;

    @Id
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "account_id")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "addresss")
    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "major_id")
    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    @Basic
    @Column(name = "qualification")
    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBO userBO = (UserBO) o;
        return Objects.equals(userId, userBO.userId) &&
                Objects.equals(accountId, userBO.accountId) &&
                Objects.equals(addresss, userBO.addresss) &&
                Objects.equals(birthday, userBO.birthday) &&
                Objects.equals(name, userBO.name) &&
                Objects.equals(avatar, userBO.avatar) &&
                Objects.equals(gender, userBO.gender) &&
                Objects.equals(majorId, userBO.majorId) &&
                Objects.equals(qualification, userBO.qualification);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, accountId, addresss, birthday, name, avatar, gender, majorId, qualification);
    }
}
