package com.gilfoyle.design.structural.adapter.classs;

/**
 * @author jaylee
 * @description: 兼容老功能、新功能
 * @author: Mr.JayLee
 * @create: 2022-09-06 22:55
 */
public interface TargetAble {
	/**
	 * 与 OldSource 中的 checkUser 一样
	 */
	void checkUser();
	
	
	/**
	 * 新类的方法
	 */
	void verifyUser();
}
