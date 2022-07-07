package com.gilfoyle.design.creational.singleton.lazy;

/**
 * @author jaylee
 * @description: 双重检测懒加载单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:18
 */

/**
 * 优点：
 * 性能提高了、线程安全
 * 缺点：
 * 不够优雅（可能性不够优雅）
 */
public class LazyDoubleCheckSingleton {
	
	private static LazyDoubleCheckSingleton instance;
	
	private LazyDoubleCheckSingleton() {
	
	}
	
	public static LazyDoubleCheckSingleton getInstance() {
		
		if (instance == null) {// 检查是否要阻塞
			synchronized (LazyDoubleCheckSingleton.class) {
				if (instance == null) {// 检查是否要重新创建实例
					instance = new LazyDoubleCheckSingleton();// 指令重排问题
				}
			}
		}
		return instance;
	}
}
