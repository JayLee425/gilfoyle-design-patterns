package com.gilfoyle.design.behavioral.visitor.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:17
 */
public class MyVisitor implements Visitor {
	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject：" + sub.getSubject());
	}
}
