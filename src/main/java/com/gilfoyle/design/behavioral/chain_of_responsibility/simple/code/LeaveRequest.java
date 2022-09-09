package com.gilfoyle.design.behavioral.chain_of_responsibility.simple.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jaylee
 * @description: 请假的请求类
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequest {
	/**
	 * 请假的天数
	 */
	private int leaveDays;
	
	/**
	 * 请假人的名字
	 */
	private String name;
	
}
