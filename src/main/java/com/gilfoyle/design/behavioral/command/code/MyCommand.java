package com.gilfoyle.design.behavioral.command.code;

/**
 * @author jaylee
 * @description:
 *              MyCommand是命令，实现了Command接口，
 *          持有  todo 执行命令的对象
 *
 * @author: Mr.JayLee
 * @create: 2022-09-09 20:15
 */
public class MyCommand implements Command{
	
	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * 司令员下边的 管理者，找士兵， 下达命令
	 */
	@Override
	public void exe() {
		receiver.action();
	}
}
