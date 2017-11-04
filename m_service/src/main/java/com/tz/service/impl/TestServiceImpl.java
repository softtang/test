package com.tz.service.impl;

import com.tz.dao.TestDao;
import com.tz.dao.impl.TestDaoImpl;
import com.tz.entity.Test;
import com.tz.service.TestService;

import java.util.List;

/**
 * Created by tangzhe on 2017/11/3.
 */
public class TestServiceImpl implements TestService{
    @Override
    public List<Test> findAll() {
        TestDao testDao = new TestDaoImpl();
        return testDao.findAll();
    }
}
