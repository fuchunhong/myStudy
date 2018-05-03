package com.sfa.restaurant.service;

import com.sfa.restaurant.entity.Testing;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fuchunhong
 * @since 2018-05-03
 */
public interface TestingService extends IService<Testing> {

    List<Testing> getTesting(String age);
}
