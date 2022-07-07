package com.gilfoyle.design.creational.singleton.hungry;

/**
 * @author jaylee
 * @description: static饿汉式单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:02
 */

/**
 * 优点：
 * 执行效率高、性能高、没有任何锁
 * 缺点：
 * 某些情况之下，可能会造成内存浪费
 * （不管用不用，类一加载就创建）
 */
public class HungryStaticSingleton {
	
	/**
	 * 1、先静态 后动态
	 * 2、先上，后下
	 * 3、先属性 后方法
	 */
	
	private static final HungryStaticSingleton HUNGRY_SINGLETON;
	
	static {
		HUNGRY_SINGLETON = new HungryStaticSingleton();
	}
	
	private HungryStaticSingleton() {
	
	}
	
	public static HungryStaticSingleton getInstance() {
		return HUNGRY_SINGLETON;
	}
}
