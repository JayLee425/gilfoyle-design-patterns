package com.gilfoyle.design.behavioral.observer.test;

import com.gilfoyle.design.behavioral.observer.code.MySubject;
import com.gilfoyle.design.behavioral.observer.code.ObserverOne;
import com.gilfoyle.design.behavioral.observer.code.ObserverTwo;
import com.gilfoyle.design.behavioral.observer.code.Subject;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 16:26
 */
public class ObserverTest {
	public static void main(String[] args) {
		ObserverOne observerOne = new ObserverOne();
		ObserverTwo observerTwo = new ObserverTwo();
		
		Subject subject = new MySubject();
		subject.add(observerOne);
		subject.add(observerTwo);
		subject.operation();
		System.out.println();
		
		subject.del(observerTwo);
		subject.operation();
	}
}
