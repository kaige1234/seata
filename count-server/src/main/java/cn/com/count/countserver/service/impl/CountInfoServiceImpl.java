package cn.com.count.countserver.service.impl;

import cn.com.count.countserver.entity.CountInfo;
import cn.com.count.countserver.mapper.CountInfoMapper;
import cn.com.count.countserver.service.ICountInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunkai
 * @since 2021-03-29
 */
@Service
public class CountInfoServiceImpl extends ServiceImpl<CountInfoMapper, CountInfo> implements ICountInfoService {

}
