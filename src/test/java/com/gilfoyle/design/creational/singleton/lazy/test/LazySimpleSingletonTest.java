package com.gilfoyle.design.creational.singleton.lazy.test;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-07 23:27
 */
public class LazySimpleSingletonTest {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ExecutionerThread());
		Thread thread2 = new Thread(new ExecutionerThread());
		
		thread1.start();
		thread2.start();
		
		System.out.println("End");
	}
}
