package com.gilfoyle.design.behavioral.state.test;

import com.gilfoyle.design.behavioral.state.code.Context;
import com.gilfoyle.design.behavioral.state.code.State;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:05
 */
public class StateTest {
	public static void main(String[] args) {
		
		State state = new State();
		Context context = new Context(state);
		
		//设置第一种状态
		state.setValue("state1");
		context.method();
		
		//设置第二种状态
		state.setValue("state2");
		context.method();
	}
}
