package com.gilfoyle.design.behavioral.chain_of_responsibility.simple.test;

import com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code.DeptManagerHandler;
import com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code.DirectLeaderHandler;
import com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code.GManagerHandler;
import com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code.LeaveRequest;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:54
 */
public class Leave_ChainTest {
	public static void main(String[] args) {
		GManagerHandler gManagerHandler = new GManagerHandler();
		DeptManagerHandler deptManagerHandler = new DeptManagerHandler();
		DirectLeaderHandler directLeaderHandler = new DirectLeaderHandler();
		directLeaderHandler.setNextHandler(deptManagerHandler);
		deptManagerHandler.setNextHandler(gManagerHandler);
		
		LeaveRequest request = LeaveRequest.builder()
				                       .leaveDays(18)
				                       .name("小明")
				                       .build();
		System.out.println(request.getName() + "发起请" + request.getLeaveDays() + "天假的申请");
		directLeaderHandler.handlerRequest(request);
		System.out.println();
		
		LeaveRequest request2 = LeaveRequest.builder()
				                        .leaveDays(1)
				                        .name("小红")
				                        .build();
		System.out.println(request2.getName() + "发起请" + request2.getLeaveDays() + "天假的申请");
		directLeaderHandler.handlerRequest(request2);
		System.out.println();
		
		LeaveRequest request3 = LeaveRequest.builder()
				                        .leaveDays(2)
				                        .name("小亮")
				                        .build();
		System.out.println(request3.getName() + "发起请" + request3.getLeaveDays() + "天假的申请");
		directLeaderHandler.handlerRequest(request3);
		System.out.println();
		
		LeaveRequest request4 = LeaveRequest.builder()
				                        .leaveDays(45)
				                        .name("王五")
				                        .build();
		System.out.println(request4.getName() + "发起请" + request4.getLeaveDays() + "天假的申请");
		directLeaderHandler.handlerRequest(request4);
	}
}
