package com.emulational.back.service.impl;

import com.emulational.back.service.EmulationService;
import com.emulational.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;

/**
*
* 仿真服务实现
* */
public class EmulationServiceImpl implements EmulationService {
    @Resource
    UserServiceImpl userService;

    public Json remoteEmulationShToJson(){
        return null;
    }

    @Override
    public Json LocalEmulationShToJson() {

        return null;
    }
}
