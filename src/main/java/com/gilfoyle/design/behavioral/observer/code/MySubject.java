package com.gilfoyle.design.behavioral.observer.code;

/**
 * @author jaylee
 * @description: todo 在状态发生变化时通知观察者
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:23
 */
public class MySubject extends AbstractSubject {
	
	/**
	 * 通知所有观察者操作
	 */
	@Override
	public void operation() {
		System.out.println("update myself!");
		notifyObservers();
	}
}
