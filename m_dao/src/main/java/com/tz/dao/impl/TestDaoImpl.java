package com.tz.dao.impl;

import com.tz.dao.TestDao;
import com.tz.entity.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangzhe on 2017/11/3.
 */
public class TestDaoImpl implements TestDao{
    @Override
    public List<Test> findAll() {
        List<Test> list = new ArrayList<>();
        for (int i=0;i<5;i++){
            Test test = new Test(i,"test"+i);
            list.add(test);
        }
        return list;
    }
}
