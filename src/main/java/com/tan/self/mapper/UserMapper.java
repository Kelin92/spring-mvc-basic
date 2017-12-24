package com.tan.self.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.tan.self.pojo.User;

import java.util.List;

/**
 * Author: Mr.tan
 * Date: 2017/12/24
 */
public interface UserMapper extends BaseMapper<User> {

    User selectCustom();

    List<User> selectUserList(Pagination pagination);
}
