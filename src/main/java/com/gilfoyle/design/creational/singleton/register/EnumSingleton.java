package com.gilfoyle.design.creational.singleton.register;

/**
 * @author jaylee
 * @description: 枚举单例模式（注册方式）
 * @author: Mr.JayLee
 * @create: 2022-07-08 00:27
 */

/**
 * 优点：
 *      代码优雅、禁止反射破坏、线程安全
 * 缺点：
 *      不能大量创建
 */
public enum EnumSingleton {
	
	 //Enum
	INSTANCE;
	
	private Object data;
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public static EnumSingleton getInstance() {
		return INSTANCE;
	}
}
