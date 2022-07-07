package com.gilfoyle.design.creational.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jaylee
 * @description: 类似Spring容器(IOC方式) 单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-08 00:45
 */
public class ContainerSingleton {
	
	private ContainerSingleton() {
	}
	
	private static Map<String, Object> ioc = new ConcurrentHashMap<>();
	
	public static Object getInstance(String className) {
		Object instance = null;
		if (!ioc.containsKey(className)) {
			try {
				instance = Class.forName(className).newInstance();
				ioc.put(className, instance);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return instance;
		} else {
			return ioc.get(className);
		}
	}
}
