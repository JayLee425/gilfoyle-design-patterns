package com.gilfoyle.design.creational.singleton.lazy.test;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:58
 */
public class LazyDoubleCheckSingletonTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ExecutionerDoubleCheckThread());
		Thread t2 = new Thread(new ExecutionerDoubleCheckThread());
		
		t1.start();
		t2.start();
		
		System.out.println("End");
	}
}
