package com.itcat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itcat.entity.Blog;
import com.itcat.mapper.BlogMapper;
import com.itcat.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
