package com.gilfoyle.design.creational.singleton.cas.test;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 10:15
 */
public class CasSingletonTest {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new CasTestThread());
		Thread t2 = new Thread(new CasTestThread());
		
		t1.start();
		t2.start();
		
		System.out.println("Cas Singleton End");
	}
}
