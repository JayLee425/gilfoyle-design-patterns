package com.gilfoyle.design.behavioral.observer.code;

/**
 * @author jaylee
 * @description: 观察者one
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:17
 */
public class ObserverOne implements Observer{
	@Override
	public void update() {
		System.out.println("ObserverOne has received!");
	}
}
