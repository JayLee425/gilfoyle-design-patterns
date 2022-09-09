package com.gilfoyle.design.structural.proxy.dynamic;

/**
 * @author jaylee
 * @description: 牛翠花讨薪水，诉讼接口
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:37
 */
public interface LawSuit {
	/**
	 * 诉讼
	 *
	 * @param proof  证据
	 */
	void lawsuit(String proof);
	
	/**
	 * 法庭辩护
	 */
	void defend();
}
