package com.tz.dao;

import com.tz.entity.Test;
import java.util.List;

/**
 * Created by tangzhe on 2017/11/3.
 */
public interface TestDao {
    List<Test> findAll();
}
