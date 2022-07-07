package com.gilfoyle.design.creational.singleton.threadlocal;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 01:22
 */
public class ThreadLocalSingleton {
	
	private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());
	
	private ThreadLocalSingleton() {
	
	}
	
	public static ThreadLocalSingleton getInstance() {
		return THREAD_LOCAL_INSTANCE.get();
	}
	
}
