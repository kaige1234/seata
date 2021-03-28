package com.order.orderserver.controller;


import com.order.orderserver.service.ITestService;
import com.order.orderserver.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunkai
 * @since 2021-03-28
 */
@RestController
@Api(tags = "TestController")
@RequestMapping("/orderserver/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping("/get")
    public String get(){
        return testService.get();
    }

    @PostMapping("create")
    public int create(String name){
        return testService.create(name);
    }

}
