package com.gilfoyle.design.creational.singleton.register.test;

import com.gilfoyle.design.creational.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-08 00:28
 */
public class EnumSingletonTest {
	public static void main(String[] args) {
		EnumSingleton instance = EnumSingleton.getInstance();
		instance.setData(new Object());
		
		try {
			Class<EnumSingleton> clazz = EnumSingleton.class;
			Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
			constructor.setAccessible(true);
			
			// Cannot reflectively create enum objects
			Object obj = constructor.newInstance();
			
			System.out.println(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
