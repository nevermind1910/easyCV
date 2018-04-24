package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "job", schema = "easy_cv", catalog = "")
public class JobBO {
    private Integer jobId;
    private Integer majorId;
    private String name;
    private String description;

    @Id
    @Column(name = "job_id")
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        JobBO jobBO = (JobBO) o;
        return Objects.equals(jobId, jobBO.jobId) &&
                Objects.equals(majorId, jobBO.majorId) &&
                Objects.equals(name, jobBO.name) &&
                Objects.equals(description, jobBO.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(jobId, majorId, name, description);
    }
}
