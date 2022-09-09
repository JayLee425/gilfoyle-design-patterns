package com.gilfoyle.design.behavioral.mediator.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:34
 */
public class User2 extends User {
	
	public User2(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user2 exe!");
	}
}
