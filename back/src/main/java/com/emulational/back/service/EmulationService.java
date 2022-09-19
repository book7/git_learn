package com.emulational.back.service;

import springfox.documentation.spring.web.json.Json;

/**
*
* 仿真服务
* */
public interface EmulationService {

    /**
     * 远程连接liunx服务器
     * 执行 sh文件
     * 返回：json数据
     * */
    public Json remoteEmulationShToJson();

    /**
     * 本地liunx服务器地址（该springboot已经运行在liunx服务武器上了）
     * 执行 sh文件
     * 返回：json数据
     * */
    public Json LocalEmulationShToJson();
}
