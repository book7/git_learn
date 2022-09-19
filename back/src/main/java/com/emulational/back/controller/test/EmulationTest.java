package com.emulational.back.controller.test;


import com.emulational.back.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
@RequestMapping("/EmulationTest")
@Api(tags = "仿真测试页面")
public class EmulationTest {
    @ApiOperation(value = "测试 执行 sh文件")
    @GetMapping("/testSh")
    public Result testRedisCacheable() {

        return Result.ok();
    }
    @ApiOperation(value = "测试 执行 sh文件 (案例）")
    @GetMapping("/runcmd")
    public String runShellScript() {
        try {
            // 指定Shell脚本的路径
            String scriptPath = "src/main/resources/static/Sh/test.sh";
            // 调用Shell脚本
            String output = executeShellCommand(scriptPath);
            return "Shell script output: " + output;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error executing Shell script";
        }
    }
    private String executeShellCommand(String scriptPath) throws IOException, InterruptedException {
        // 使用ProcessBuilder来执行Shell脚本
        ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", scriptPath);

        // 启动进程并获取进程实例
        Process process = processBuilder.start();

        // 读取Shell脚本的输出
        StringBuilder output = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        }
        // 等待Shell脚本执行完毕
        int exitCode = process.waitFor();
        // 打印Shell脚本的退出码
        System.out.println("Exit Code: " + exitCode);
        return output.toString();
    }


}
