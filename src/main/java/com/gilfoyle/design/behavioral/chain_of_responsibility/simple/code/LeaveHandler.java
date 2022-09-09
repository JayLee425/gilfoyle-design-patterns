package com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:48
 */
public abstract class LeaveHandler {
	/**
	 * 需主管审批的天数
	 */
	protected final static int MIN = 1;
	
	/**
	 * 需部门经理审批的天数
	 */
	protected final static int MIDDLE = 3;
	
	/**
	 * 需总经理历审批的天数
	 */
	protected final static int MAX = 30;
	
	
	protected LeaveHandler nextHandler;
	
	/**
	 * 设置下一个审批者
	 *
	 * @param nextHandler
	 */
	public void setNextHandler(LeaveHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	/**
	 * 需要子类进行重写
	 *
	 * @param request
	 */
	protected abstract void handlerRequest(LeaveRequest request);
}
