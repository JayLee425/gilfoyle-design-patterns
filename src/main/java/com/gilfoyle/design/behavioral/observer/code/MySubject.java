package com.gilfoyle.design.behavioral.observer.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:23
 */
public class MySubject extends AbstractSubject {
	@Override
	public void operation() {
		System.out.println("update myself!");
		notifyObservers();
	}
}
