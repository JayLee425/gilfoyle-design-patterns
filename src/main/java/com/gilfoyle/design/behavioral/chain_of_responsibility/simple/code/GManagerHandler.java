package com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code;

/**
 * @author jaylee
 * @description: 定义总经理处理类：GManagerHandler
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:52
 */
public class GManagerHandler extends LeaveHandler {
	@Override
	public void handlerRequest(LeaveRequest request) {
		if (request.getLeaveDays() <= MAX) {
			System.out.println("总经理:已审批 请假申请通过");
			return;
		}
		//如果大于30天的，根据具体的需要进行处理
		if (request.getLeaveDays() > MAX) {
			// other invoke
			System.out.println("请找HrBP处理 …… ");
		}
	}
}
