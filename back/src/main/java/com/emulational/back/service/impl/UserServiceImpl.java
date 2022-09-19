package com.emulational.back.service.impl;

import com.emulational.back.service.UserService;
import com.emulational.back.entity.User;
import com.emulational.back.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>

 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
