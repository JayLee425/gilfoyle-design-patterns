package com.gilfoyle.design.behavioral.mediator.test;

import com.gilfoyle.design.behavioral.mediator.code.Mediator;
import com.gilfoyle.design.behavioral.mediator.code.MyMediator;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:36
 */
public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
