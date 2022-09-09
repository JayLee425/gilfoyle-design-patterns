package com.gilfoyle.design.behavioral.mediator.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:35
 */
public class MyMediator implements Mediator {
	private User user1;
	private User user2;
	
	public User getUser1() {
		return user1;
	}
	
	public User getUser2() {
		return user2;
	}
	
	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}
	
	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}
}
