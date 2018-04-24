package com.nqttt.easycv.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skill", schema = "easy_cv", catalog = "")
public class SkillBO {
    private Integer skillId;
    private Integer level;
    private Integer cvId;
    private String name;

    @Id
    @Column(name = "skill_id")
    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillBO skillBO = (SkillBO) o;
        return Objects.equals(skillId, skillBO.skillId) &&
                Objects.equals(level, skillBO.level) &&
                Objects.equals(cvId, skillBO.cvId) &&
                Objects.equals(name, skillBO.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(skillId, level, cvId, name);
    }
}
