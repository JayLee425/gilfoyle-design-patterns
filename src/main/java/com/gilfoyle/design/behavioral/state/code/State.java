package com.gilfoyle.design.behavioral.state.code;

import lombok.Data;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:03
 */
@Data
public class State {
	private String value;
	
	public void method1(){
		System.out.println("execute the first opt!");
	}
	
	public void method2(){
		System.out.println("execute the second opt!");
	}
}
