package com.order.orderserver.service;

import com.order.orderserver.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunkai
 * @since 2021-03-28
 */
public interface ITestService extends IService<Test> {

    String get();

    int create(String name);
}
