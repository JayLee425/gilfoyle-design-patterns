package com.gilfoyle.design.behavioral.mediator.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:33
 */
public abstract class User {
	private Mediator mediator;
	
	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator(){
		return mediator;
	}
	
	public abstract void work();
}
