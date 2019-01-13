package com.pretty.ssm.util;

import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * JSON工具类
 * 
 * @author lushaoiqng
 * @since 1.0.0
 */
public final class JsonUtil {
	
	private JsonUtil() {

	}

	/**
	 * 序列化对象
	 */
	public static String toJsonString(Object obj) {
		return JSON.toJSONString(obj);
	}

	/**
	 * 序列化List数组
	 */
	public static String toJsonArray(List<?> list) {
		return JSON.toJSONString(list, true);
	}

	/**
	 * 反序列化为json对象
	 */
	public static Object parseJsonObject(String text) {
		return JSON.parseObject(text);
	}

	/**
	 * 反序列化为javaBean对象
	 */
	public static Object parseBeanObject(String text) {
		return JSON.parseObject(text);

	}

	/**
	 * 将javaBean转化为json对象
	 */
	public static Object bean2Json(Object obj) {
		return JSON.toJSON(obj);
	}

}
