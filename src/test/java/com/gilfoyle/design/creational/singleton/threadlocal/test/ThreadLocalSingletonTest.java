package com.gilfoyle.design.creational.singleton.threadlocal.test;

import com.gilfoyle.design.creational.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 01:29
 */
public class ThreadLocalSingletonTest {
	public static void main(String[] args) {
		System.out.println(ThreadLocalSingleton.getInstance());
		System.out.println(ThreadLocalSingleton.getInstance());
		System.out.println(ThreadLocalSingleton.getInstance());
		
		
	}
}
