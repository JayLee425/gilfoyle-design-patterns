package com.gilfoyle.design.structural.proxy.statics;

/**
 * @author jaylee
 * @description: 诉讼接口
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:02
 */
public interface ILawSuit {
	
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
