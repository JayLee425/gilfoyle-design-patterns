package com.gilfoyle.design.creational.singleton.lazy.test;

import com.gilfoyle.design.creational.singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 00:16
 */
public class ReflectionTest {
	
	public static void main(String[] args) {
		try {
			Class<?> clazz = LazyStaticInnerClassSingleton.class;
			Constructor<?> constructor = clazz.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			
			Object instance1 = constructor.newInstance();
			Object instance2 = constructor.newInstance();
			
			System.out.println(instance1);
			System.out.println(instance2);
			
			System.out.println(instance1==instance2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
