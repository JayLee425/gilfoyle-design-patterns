package com.gilfoyle.design.behavioral.command.code;

/**
 * @author jaylee
 * @description: 司令员下命令 （Invoker是调用者（司令员））
 * @author: Mr.JayLee
 * @create: 2022-09-09 20:16
 */
public class Invoker {
	
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	/**
	 * 下命令，处理一件事情
	 */
	public void handler() {
		command.exe();
	}
}
