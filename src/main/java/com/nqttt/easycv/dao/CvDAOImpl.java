package com.nqttt.easycv.dao;

import com.nqttt.easycv.entity.CvBO;
import com.nqttt.easycv.model.CvDTO;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CvDAOImpl implements CvDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<CvDTO> doSearch(CvDTO obj) {
        return null;
    }

    @Override
    public boolean add(CvBO obj) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(obj);
        return true;
    }

    @Override
    public boolean edit(CvDTO obj) {
        System.out.println("ádasdasd");
        return false;
    }

    @Override
    public boolean remove(CvDTO obj) {
        return false;
    }

    @Override
    public CvDTO getById(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        StringBuilder sql = new StringBuilder();
        sql.append(" Select cv.cv_id cvId,");
        sql.append("    cv.title title, ");
        sql.append("    cv.description description ");
        sql.append(" From cv");
        sql.append(" Where cv.cv_id =:id ");
        SQLQuery query = session.createSQLQuery(sql.toString());
        query.setResultTransformer(Transformers.aliasToBean(CvDTO.class));
        query.setParameter("id",id);
        query.addScalar("cvId",IntegerType.INSTANCE);
        query.addScalar("title",StringType.INSTANCE);
        query.addScalar("description",StringType.INSTANCE);
        return (CvDTO) query.uniqueResult();


    }
}
