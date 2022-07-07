package com.gilfoyle.design.creational.singleton.lazy;

/**
 * @author jaylee
 * @description:   静态内部类懒加载单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-08 00:08
 */

/**
 * 优点：
 *      代码优雅、利用了Java本身语法特点、性能高、避免内存浪费
 * 缺点：
 *      被反射破坏
 */
public class LazyStaticInnerClassSingleton {
	private volatile boolean flag;
	private LazyStaticInnerClassSingleton() {
		if (!flag && LazyHolder.INSTANCE == null) {
			flag = true;
		}else{
			throw new RuntimeException("不允许非法访问");
		}
		if (LazyHolder.INSTANCE != null) {
			throw new RuntimeException("不允许非法访问");
		}
	}
	
	private static LazyStaticInnerClassSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	/**
	 * 在调用 getInstance()方法时，
	 *      才加载 LazyStaticInnerClassSingleton$LazyHolder.class
	 *      创建 INSTANCE （通过new的方式 创建对象）
	 */
	private static class LazyHolder {
		private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
	}
}
