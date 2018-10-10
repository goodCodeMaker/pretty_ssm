package com.pretty.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pretty.ssm.entity.User;

/**
 * 用户管理持久层接口
 *
 * @author Admin
 *
 * @since 2018-10-08
 */
public interface UserDao {

	/**
	 * 根据手机号查询用户对象
	 * 
	 * @param userPhone
	 * @return
	 */
	public User queryByPhone(long userPhone);

	/**
	  * 根据偏移量查询用户列表
	 * 
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
