package com.pretty.ssm.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pretty.ssm.entity.User;
import com.pretty.ssm.service.UserService;
import com.pretty.ssm.util.JsonUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	// 返回JSON格式
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer limit) {
		LOGGER.info("---返回User的JSON格式----");
		offset = offset == null ? 0 : offset;
		limit = limit == null ? 10 : limit;
		List<User> userList = userService.getUserList(offset, limit);
		System.out.println("11111111111");
		return JsonUtil.toJsonArray(userList);
	}
}
