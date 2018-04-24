package com.nqttt.easycv.controller;


import com.nqttt.easycv.dao.CvDAOImpl;
import com.nqttt.easycv.entity.CvBO;
import com.nqttt.easycv.model.CvDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CvController {

    @Autowired
    private CvDAOImpl cvDAO;

    @RequestMapping(value = "/cv/doSearch", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<CvDTO> getEmployees(CvDTO obj) {
        List<CvDTO> list = cvDAO.doSearch(obj);
        return list;
    }

    @RequestMapping(value = "/cv/getById/", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public CvDTO getById(@RequestBody String id) {
        CvDTO cvDTO = cvDAO.getById(id);
        return cvDTO;
    }

    @RequestMapping(value = "/cv/save", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public boolean save(@RequestBody CvBO obj) {
        return cvDAO.add(obj);
    }
}
