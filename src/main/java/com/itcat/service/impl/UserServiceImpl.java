package com.itcat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itcat.entity.User;
import com.itcat.mapper.UserMapper;
import com.itcat.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
