package com.gilfoyle.design.structural.proxy.statics;

/**
 * @author jaylee
 * @description: 产生代理对象的 静态代理工厂类
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:22
 */
public class ProxyStaticFactory {
	public static ILawSuit getProxy(){
		return new ProxyLawyer(new DogLee());
	}
}
