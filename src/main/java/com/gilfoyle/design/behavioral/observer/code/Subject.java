package com.gilfoyle.design.behavioral.observer.code;

/**
 * @author jaylee
 * @description: 主题 （被观察者，Subject 或者叫 Observable ）
 *          {todo 目标对象，知道观察者，拥有添加删除观察者的接口方法}
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:18
 */
public interface Subject {
	
	/*增加观察者*/
	void add(Observer observer);
	
	/*删除观察者*/
	void del(Observer observer);
	
	/**
	 * 通知所有的观察者
	 **/
	void notifyObservers();
	
	/**
	 * 自身的操作,留给子类去扩展
	 * **/
	void operation();
}
