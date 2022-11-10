package com.gilfoyle.design.behavioral.observer.code;

import java.util.Vector;

/**
 * @author jaylee
 * @description: todo 具体目标对象，维护观察者集合，在状态发生变化时通知观察者
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:18
 */
public abstract class AbstractSubject implements Subject {
	/**
	 * 持有观察者
	 */
	private Vector<Observer> vector = new Vector<Observer>();
	
	/**
	 * 添加观察者 （订阅）
	 * @param observer
	 */
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}
	
	/**
	 * 删除观察者 （退订）
	 * @param observer
	 */
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	
	/**
	 * 广而告之 （通知所有观察者，更新了信息）
	 */
	@Override
	public void notifyObservers() {
		vector.stream().forEach(Observer::update);
	}
	
}
