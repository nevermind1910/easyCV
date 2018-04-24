package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "work_experience", schema = "easy_cv", catalog = "")
public class WorkExperienceBO {
    private Integer workExperienceId;
    private Integer cvId;
    private String description;
    private String name;
    private Date dateFrom;
    private Date dateTo;

    @Id
    @Column(name = "work_experience_id")
    public Integer getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(Integer workExperienceId) {
        this.workExperienceId = workExperienceId;
    }

    @Basic
    @Column(name = "cv_id")
    public Integer getCvId() {
        return cvId;
    }

    public void setCvId(Integer cvId) {
        this.cvId = cvId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "date_from")
    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Basic
    @Column(name = "date_to")
    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkExperienceBO that = (WorkExperienceBO) o;
        return Objects.equals(workExperienceId, that.workExperienceId) &&
                Objects.equals(cvId, that.cvId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateFrom, that.dateFrom) &&
                Objects.equals(dateTo, that.dateTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(workExperienceId, cvId, description, name, dateFrom, dateTo);
    }
}
