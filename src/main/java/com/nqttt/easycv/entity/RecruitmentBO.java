package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "recruitment", schema = "easy_cv", catalog = "")
public class RecruitmentBO {
    private Integer recruitmentId;
    private Integer companyId;
    private Date createdDate;
    private Date expiryDate;
    private Integer jobId;
    private String description;
    private Integer experienceId;
    private Integer salary;
    private Integer workPlace;
    private Integer status;
    private String title;
    private Integer timeType;
    private Integer majorId;
    private String position;

    @Id
    @Column(name = "recruitment_id")
    public Integer getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(Integer recruitmentId) {
        this.recruitmentId = recruitmentId;
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
    @Column(name = "created_date")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "expiry_date")
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Basic
    @Column(name = "job_id")
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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
    @Column(name = "experience_id")
    public Integer getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Integer experienceId) {
        this.experienceId = experienceId;
    }

    @Basic
    @Column(name = "salary")
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "work_place")
    public Integer getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(Integer workPlace) {
        this.workPlace = workPlace;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "time_type")
    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
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
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecruitmentBO that = (RecruitmentBO) o;
        return Objects.equals(recruitmentId, that.recruitmentId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(expiryDate, that.expiryDate) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(experienceId, that.experienceId) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(workPlace, that.workPlace) &&
                Objects.equals(status, that.status) &&
                Objects.equals(title, that.title) &&
                Objects.equals(timeType, that.timeType) &&
                Objects.equals(majorId, that.majorId) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {

        return Objects.hash(recruitmentId, companyId, createdDate, expiryDate, jobId, description, experienceId, salary, workPlace, status, title, timeType, majorId, position);
    }
}
