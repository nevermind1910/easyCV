package com.nqttt.easycv.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CvDTO {
    private Integer cvId;
    private String objective;
    private Integer userId;
    private Integer majorId;
    private String title;
    private String description;
    private Date createdDate;
    private Integer jobId;
    private List<SkillDTO> listSkill;
    private List<EducationDTO> listEducation;
    private List<WorkExperienceDTO> listWorkExperience;

    public CvDTO() {

    }

    public Integer getCvId() {
        return cvId;
    }

    public void setCvId(Integer cvId) {
        this.cvId = cvId;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public List<SkillDTO> getListSkill() {
        return listSkill;
    }

    public void setListSkill(List<SkillDTO> listSkill) {
        this.listSkill = listSkill;
    }

    public List<EducationDTO> getListEducation() {
        return listEducation;
    }

    public void setListEducation(List<EducationDTO> listEducation) {
        this.listEducation = listEducation;
    }

    public List<WorkExperienceDTO> getListWorkExperience() {
        return listWorkExperience;
    }

    public void setListWorkExperience(List<WorkExperienceDTO> listWorkExperience) {
        this.listWorkExperience = listWorkExperience;
    }
}
