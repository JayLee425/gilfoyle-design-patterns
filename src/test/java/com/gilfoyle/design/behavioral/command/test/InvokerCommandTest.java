package com.gilfoyle.design.behavioral.command.test;

import com.gilfoyle.design.behavioral.command.code.Command;
import com.gilfoyle.design.behavioral.command.code.Invoker;
import com.gilfoyle.design.behavioral.command.code.MyCommand;
import com.gilfoyle.design.behavioral.command.code.Receiver;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 20:17
 */
public class InvokerCommandTest {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.handler();
	}
}
