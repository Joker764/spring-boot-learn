package com.hachi.jpa.service.impl;

import com.hachi.jpa.dao.CnrDao;
import com.hachi.jpa.entity.Cnr;
import com.hachi.jpa.service.CnrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CnrServiceImpl implements CnrService {

    @Autowired
    CnrDao cnrDao;

    @Override
    public List<Cnr> findAllCnr() {
        return cnrDao.findAll();
    }
}
