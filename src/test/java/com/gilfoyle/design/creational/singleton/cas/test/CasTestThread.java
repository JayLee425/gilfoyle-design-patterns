package com.gilfoyle.design.creational.singleton.cas.test;

import com.gilfoyle.design.creational.singleton.cas.CasSingleton;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 10:16
 */
public class CasTestThread implements Runnable{
	@Override
	public void run() {
		CasSingleton instance = CasSingleton.getInstance();
		System.out.println(Thread.currentThread().getName() + " : " + instance);
	}
}
