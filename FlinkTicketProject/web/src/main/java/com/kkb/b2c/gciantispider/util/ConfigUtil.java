package com.kkb.b2c.gciantispider.util;

import java.util.ResourceBundle;

/**
 * 项目参数工具类
 * 
 * 
 */
public class ConfigUtil {

	private static final ResourceBundle bundle = ResourceBundle.getBundle("config");

	/**
	 * 获得sessionInfo名字
	 * 
	 * @return
	 */
	public static final String getSessionInfoName() {
		return bundle.getString("sessionInfoName");
	}

	/**
	 * 通过键获取值
	 * 
	 * @param key
	 * @return
	 */
	public static String get(String key) {
		return bundle.getString(key);
	}

}
