package com.gilfoyle.design.behavioral.state.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:03
 */
public class Context {
	private State state;
	
	public Context(State state) {
		this.state = state;
	}
	
	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
}
