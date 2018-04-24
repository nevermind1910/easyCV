package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "education", schema = "easy_cv", catalog = "")
public class EducationBO {
    private Integer educationId;
    private String schoolName;
    private String specialized;
    private String description;
    private Integer cvId;

    @Id
    @Column(name = "education_id")
    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    @Basic
    @Column(name = "school_name")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "specialized")
    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
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
    @Column(name = "cv_id")
    public Integer getCvId() {
        return cvId;
    }

    public void setCvId(Integer cvId) {
        this.cvId = cvId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationBO that = (EducationBO) o;
        return Objects.equals(educationId, that.educationId) &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(specialized, that.specialized) &&
                Objects.equals(description, that.description) &&
                Objects.equals(cvId, that.cvId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(educationId, schoolName, specialized, description, cvId);
    }
}
