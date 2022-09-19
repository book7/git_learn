package com.emulational.back.modules.FLFP;


import com.emulational.back.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FLFPController")
@Api(tags = "送风制度")
public class FLFPController {
    @ApiOperation(value = "测试 执行 sh文件")
    @GetMapping("/testSh")
    public Result testRedisCacheable() {

        return Result.ok();
    }



}
