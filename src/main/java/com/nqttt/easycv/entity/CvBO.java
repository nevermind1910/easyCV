package com.nqttt.easycv.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "cv", schema = "easy_cv")
public class CvBO {
    private Integer cvId;
    private String objective;
    private Integer userId;
    private Integer majorId;
    private String title;
    private String description;
    private Date createdDate;
    private Integer jobId;

    @Id
    @Column(name = "cv_id")
    public Integer getCvId() {
        return cvId;
    }

    public void setCvId(Integer cvId) {
        this.cvId = cvId;
    }

    @Basic
    @Column(name = "objective")
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "created_date")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "job_id")
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CvBO cvBO = (CvBO) o;
        return Objects.equals(cvId, cvBO.cvId) &&
                Objects.equals(objective, cvBO.objective) &&
                Objects.equals(userId, cvBO.userId) &&
                Objects.equals(majorId, cvBO.majorId) &&
                Objects.equals(title, cvBO.title) &&
                Objects.equals(description, cvBO.description) &&
                Objects.equals(createdDate, cvBO.createdDate) &&
                Objects.equals(jobId, cvBO.jobId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cvId, objective, userId, majorId, title, description, createdDate, jobId);
    }
}
