package com.gilfoyle.design.creational.singleton.lazy;

/**
 * @author jaylee
 * @description: Synchronized 懒加载单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:18
 */

/**
 * 优点：
 *      线程安全
 * 缺点：
 *      影响并发效率（只能一个一个调用）
 */
public class LazySynchronizedSimpleSingleton {
	
	private static LazySynchronizedSimpleSingleton instance;
	private LazySynchronizedSimpleSingleton() {
	
	}
	
	public synchronized static LazySynchronizedSimpleSingleton getInstance() {
		if (instance == null) {
			instance = new LazySynchronizedSimpleSingleton();
		}
		return instance;
	}
}
