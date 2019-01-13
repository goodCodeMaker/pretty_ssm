/**
 * 
 */
package com.pretty.ssm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页
 *
 * @author Admin
 *
 * @since 2018-10-09
 */
@Controller
public class IndexController {
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/indexAction")
	public ModelAndView search() {

		logger.info("我是一号程序员");
		// 放入转发参数
		ModelAndView mav = new ModelAndView();
		mav.addObject("users", "name");

		// 放入jsp路径
		mav.setViewName("index");
		return mav;
	}
}
