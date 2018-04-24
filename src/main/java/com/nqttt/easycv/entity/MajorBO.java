package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "major", schema = "easy_cv", catalog = "")
public class MajorBO {
    private Integer majorId;
    private String name;
    private String description;

    @Id
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
        MajorBO majorBO = (MajorBO) o;
        return Objects.equals(majorId, majorBO.majorId) &&
                Objects.equals(name, majorBO.name) &&
                Objects.equals(description, majorBO.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(majorId, name, description);
    }
}
