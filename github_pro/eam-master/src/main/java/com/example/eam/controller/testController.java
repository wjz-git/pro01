package com.example.eam.controller;

import com.example.eam.dto.BaseResult;
import com.example.eam.service.testService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.0
 * @Author 凌波水月
 * @date 2019/9/29 10:40
 */
@RestController
//解决前后端跨域问题,每个Controller都要加上下面这句
@CrossOrigin(origins = "*", maxAge = 3600)
public class testController {

    @Autowired
    private testService testService;

    /**
     * 使用Swagger2就添加如下两条语句, 然后参数根据自己需求进行修改
     * @param id
     * @return
     */
    @ApiOperation(value = "测试")
    @ApiImplicitParams({
            //从path路径中获取参数
            @ApiImplicitParam(name = "id", value = "测试传入参数id", required = false, dataTypeClass = Integer.class, paramType = "path")
            //从前端传入的JSON数据中获取参数
//            @ApiImplicitParam(name = "id", value = "测试传入参数id", required = false, dataTypeClass = Integer.class, paramType = "json")
    })
    @GetMapping("/test/{id}")
    public BaseResult test(@PathVariable("id") int id){
        String test = testService.test(id);
        //将返回值封装进 BaseResult 里的 data 对象
        return BaseResult.ok(test);
    }

}
