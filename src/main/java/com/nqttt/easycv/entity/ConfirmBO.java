package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "confirm", schema = "easy_cv", catalog = "")
public class ConfirmBO {
    private Integer confirmId;
    private Integer companyId;
    private Date confirmDate;
    private Integer status;
    private Integer userId;

    @Id
    @Column(name = "confirm_id")
    public Integer getConfirmId() {
        return confirmId;
    }

    public void setConfirmId(Integer confirmId) {
        this.confirmId = confirmId;
    }

    @Basic
    @Column(name = "company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "confirm_date")
    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfirmBO confirmBO = (ConfirmBO) o;
        return Objects.equals(confirmId, confirmBO.confirmId) &&
                Objects.equals(companyId, confirmBO.companyId) &&
                Objects.equals(confirmDate, confirmBO.confirmDate) &&
                Objects.equals(status, confirmBO.status) &&
                Objects.equals(userId, confirmBO.userId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(confirmId, companyId, confirmDate, status, userId);
    }
}
