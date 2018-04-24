package com.nqttt.easycv.dao;

import com.nqttt.easycv.entity.CvBO;
import com.nqttt.easycv.model.CvDTO;

import java.util.List;

public interface CvDAO {
    public List<CvDTO> doSearch(CvDTO obj);
    public boolean add(CvBO obj);
    public boolean edit(CvDTO obj);
    public boolean remove(CvDTO obj);
    public CvDTO getById(String id);

}
