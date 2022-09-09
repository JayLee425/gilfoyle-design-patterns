package com.gilfoyle.design.behavioral.command.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 20:13
 */

/**
 * Invoker是调用者（司令员），
 * Receiver是被调用者（士兵），
 * MyCommand是命令，实现了Command接口，持有接收对象
 */
public interface Command {
	
	void exe();
}
