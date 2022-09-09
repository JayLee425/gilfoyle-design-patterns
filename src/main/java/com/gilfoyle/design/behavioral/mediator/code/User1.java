package com.gilfoyle.design.behavioral.mediator.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:33
 */
public class User1 extends User {
	public User1(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user1 exe!");
	}
}
