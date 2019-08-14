package com.i7.bootswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "测试接口",description = "测试swagger接口")
public class HelloController {

    @GetMapping("/name")
    @ResponseBody
    @ApiOperation(value = "返回名字")
    @ApiImplicitParam(name = "name", value = "张三", required = true, dataType = "String")
    public String hello(String name) {
        return name;
    }
}
