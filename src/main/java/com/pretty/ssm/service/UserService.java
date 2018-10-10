package com.pretty.ssm.service;

import java.util.List;

import com.pretty.ssm.entity.User;

/**
  * 用户管理业务层接口
 *
 * @author Admin
 *
 * @since2018-10-08
 */
public interface UserService {

	List<User> getUserList(int offset, int limit);
}
