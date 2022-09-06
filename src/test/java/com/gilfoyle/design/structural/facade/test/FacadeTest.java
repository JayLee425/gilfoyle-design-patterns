package com.gilfoyle.design.structural.facade.test;

import com.gilfoyle.design.structural.facade.design.Computer;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-07 00:35
 */
public class FacadeTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		System.out.println();
		computer.shutdown();
	}
}
