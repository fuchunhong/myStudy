package com.sfa.restaurant.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sfa.restaurant.entity.Testing;
import com.sfa.restaurant.mapper.TestingMapper;
import com.sfa.restaurant.service.TestingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuchunhong
 * @since 2018-05-03
 */
@Service
public class TestingServiceImpl extends ServiceImpl<TestingMapper, Testing> implements TestingService {

    @Resource
    private TestingMapper testingMapper;

    @Override
    public List<Testing> getTesting(String age) {
        return this.testingMapper.getTesting(age);
    }
}
