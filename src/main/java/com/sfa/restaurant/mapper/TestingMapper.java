package com.sfa.restaurant.mapper;

import com.sfa.restaurant.entity.Testing;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fuchunhong
 * @since 2018-05-03
 */
public interface TestingMapper extends BaseMapper<Testing> {

    List<Testing> getTesting(String age);
}
