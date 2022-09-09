package com.gilfoyle.design.structural.proxy.dynamic;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:39
 */
public class CuiHuaNiu implements LawSuit{
	@Override
	public void lawsuit(String proof) {
		System.out.println(String.format("老板欠薪跑路，证据如下：%s",proof));
	}
	
	@Override
	public void defend() {
		System.out.println(String.format("铁证如山，%s还牛翠花血汗钱","马旭"));
	}
}
