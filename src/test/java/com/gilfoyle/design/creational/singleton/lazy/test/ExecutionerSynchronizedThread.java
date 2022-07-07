package com.gilfoyle.design.creational.singleton.lazy.test;

import com.gilfoyle.design.creational.singleton.lazy.LazySynchronizedSimpleSingleton;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:23
 */
public class ExecutionerSynchronizedThread implements Runnable {
	@Override
	public void run() {
		LazySynchronizedSimpleSingleton instance = LazySynchronizedSimpleSingleton.getInstance();
		
		System.out.println(Thread.currentThread().getName() + " : " + instance);
		
	}
}
