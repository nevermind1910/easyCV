package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "easy_cv", catalog = "")
public class CompanyBO {
    private Integer companyId;
    private String name;
    private String accountId;
    private String address;
    private String description;

    @Id
    @Column(name = "company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
    @Column(name = "account_id")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyBO companyBO = (CompanyBO) o;
        return Objects.equals(companyId, companyBO.companyId) &&
                Objects.equals(name, companyBO.name) &&
                Objects.equals(accountId, companyBO.accountId) &&
                Objects.equals(address, companyBO.address) &&
                Objects.equals(description, companyBO.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(companyId, name, accountId, address, description);
    }
}
