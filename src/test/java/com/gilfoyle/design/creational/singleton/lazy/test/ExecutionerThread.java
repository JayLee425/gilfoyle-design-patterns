package com.gilfoyle.design.creational.singleton.lazy.test;

import com.gilfoyle.design.creational.singleton.lazy.LazySimpleSingleton;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:23
 */
public class ExecutionerThread implements Runnable{
	@Override
	public void run() {
		LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
		
		System.out.println(Thread.currentThread().getName() + " : " + instance);
		
	}
}
