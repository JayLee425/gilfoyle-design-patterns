package com.gilfoyle.design.creational.singleton.lazy.test;

import com.gilfoyle.design.creational.singleton.lazy.LazyDoubleCheckSingleton;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:57
 */
public class ExecutionerDoubleCheckThread implements Runnable {
	@Override
	public void run() {
		LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
		System.out.println(Thread.currentThread().getName() + " : " + instance);
	}
}
