package com.gilfoyle.design.behavioral.command.code;

/**
 * @author jaylee
 * @description: Receiver是被调用者（士兵）
 * @author: Mr.JayLee
 * @create: 2022-09-09 20:14
 */
public class Receiver {
	
	// 士兵接收到的具体命令
	public void action() {
		System.out.println(" command received !! ");
	}
}
