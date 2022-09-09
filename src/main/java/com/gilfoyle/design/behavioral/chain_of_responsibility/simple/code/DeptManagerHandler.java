package com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code;

/**
 * @author jaylee
 * @description: 定义部门经理:DeptManagerHandler
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:51
 */
public class DeptManagerHandler extends LeaveHandler {
	@Override
	public void handlerRequest(LeaveRequest request) {
		if (request.getLeaveDays() <= MIDDLE) {
			System.out.println("部门经理:已审批 请假申请通过");
			return;
		}
		//请假天数大于3天，需要继续传递到总经理进行审批
		if (request.getLeaveDays() > MIDDLE) {
			if (nextHandler != null) {
				System.out.println("部门经理:已审批 -->> 还需要总经理审批");
				nextHandler.handlerRequest(request);
			}
		}
		
	}
}
