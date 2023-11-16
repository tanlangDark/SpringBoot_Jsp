package com.example.jsp.mapper;

import com.example.jsp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tanlang
 * @since 2023-11-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
