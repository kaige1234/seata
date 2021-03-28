package com.order.orderserver.service.impl;

import com.order.orderserver.entity.Test;
import com.order.orderserver.mapper.TestMapper;
import com.order.orderserver.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunkai
 * @since 2021-03-28
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String get() {
        Test test = testMapper.selectById(1L);
        return test.getName();
    }

    @Override
    public int create(String name) {
        Test test = new Test();
        test.setName(name);
        return testMapper.insert(test);
    }
}
