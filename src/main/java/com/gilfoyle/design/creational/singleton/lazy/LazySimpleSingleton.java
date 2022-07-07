package com.gilfoyle.design.creational.singleton.lazy;

/**
 * @author jaylee
 * @description: 简单懒加载单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:18
 */

/**
 * 优点：
 *      节省了内存（只有使用时，才创建对象）
 * 缺点：
 *      线程不安全(有时候安全，有时候不安全)
 */
public class LazySimpleSingleton {
	
	private static LazySimpleSingleton instance;
	private LazySimpleSingleton() {
	
	}
	
	public static LazySimpleSingleton getInstance() {
		if (instance == null) {
			instance = new LazySimpleSingleton();
		}
		return instance;
	}
}
