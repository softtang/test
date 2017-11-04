package com.tz.action;

import com.tz.entity.Test;
import com.tz.service.TestService;
import com.tz.service.impl.TestServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Created by tangzhe on 2017/11/3.
 */
@Controller
public class TestAction {
    @RequestMapping("/testfind")
    @ResponseBody
    public List<Test> findAll(){
        TestService testService = new TestServiceImpl();
        return testService.findAll();
    }
}
