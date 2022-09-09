package com.gilfoyle.design.structural.proxy.cglib;

/**
 * @author jaylee
 * @description: 定义业务类，被代理的类没有实现任何接口
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:20
 */
public class Frank {
	
	public void submit(String proof) {
		System.out.println(String.format("老板欠薪跑路，证据如下：%s", proof));
	}
	
	public void defend() {
		System.out.println(String.format("铁证如山，%s还Frank血汗钱", "马旭"));
	}
}
