package com.gilfoyle.design.behavioral.observer.code;

/**
 * @author jaylee
 * @description: 观察者two
 *          {todo 具体观察者，维持一个目标对象指针(也可以没有，只能被动接受通知信息)；实现更新接口。}
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:17
 */
public class ObserverTwo implements Observer {
	@Override
	public void update() {
		System.out.println("observer-two has received!!");
	}
}
