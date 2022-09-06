package com.gilfoyle.design.structural.adapter.interfaces;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-06 23:33
 */
public class InterfaceAdapterTest {
	public static void main(String[] args) {
		InterfaceFuncSub1 sub1 = new InterfaceFuncSub1();
		sub1.method1();
		
		System.out.println();
		
		FunctionSub2 sub2 = new FunctionSub2();
		sub2.method2();
	}
}
