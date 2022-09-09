package com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code;

/**
 * @author jaylee
 * @description: 定义主管审批的处理类：DirectLeaderHandler
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:50
 */
public class DirectLeaderHandler extends LeaveHandler {
	@Override
	public void handlerRequest(LeaveRequest request) {
		if (request.getLeaveDays() <= MIN) {
			System.out.println("部门主管:已审批 请假申请通过");
			return;
		}
		//请假天数大于1天，需要继续传递到部门经理进行审批
		if (request.getLeaveDays() > MIN) {
			if (nextHandler != null) {
				System.out.println("部门主管:已审批 ---> 还需要部门经理审批");
				nextHandler.handlerRequest(request);
			}
		}
		
	}
}
