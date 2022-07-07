package com.gilfoyle.design.creational.singleton.register.test;

import com.gilfoyle.design.creational.singleton.register.ContainerSingleton;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 00:48
 */
public class ContainerSingletonTest {
	public static void main(String[] args) {
		Object instance1 = ContainerSingleton.getInstance("com.gilfoyle.design.creational.singleton.register.test.Project");
		Object instance2 = ContainerSingleton.getInstance("com.gilfoyle.design.creational.singleton.register.test.Project");
		
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance1 == instance2);
	}
}
