package com.sfa.restaurant.controller;

import com.sfa.restaurant.common.RestResponse;
import com.sfa.restaurant.common.Urlcenter;
import com.sfa.restaurant.entity.Testing;
import com.sfa.restaurant.service.TestingService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Demo {
    @Resource
    private TestingService testingService;

    @RequestMapping(value = Urlcenter.TESTING,method = RequestMethod.GET)
    public RestResponse<String> testing (){

        return RestResponse.success("测试");
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "age", value = "用户年龄", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = Urlcenter.DEMO,method = RequestMethod.GET)
    public RestResponse<List<Testing>> ceshi(@RequestParam("age") String age){

        List<Testing> testing = this.testingService.getTesting(age);
        System.out.println("哈哈哈");
        return RestResponse.success(testing);

    }
}
