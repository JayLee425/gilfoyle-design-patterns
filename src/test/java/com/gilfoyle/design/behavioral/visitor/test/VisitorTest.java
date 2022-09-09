package com.gilfoyle.design.behavioral.visitor.test;

import com.gilfoyle.design.behavioral.visitor.code.MySubject;
import com.gilfoyle.design.behavioral.visitor.code.MyVisitor;
import com.gilfoyle.design.behavioral.visitor.code.Subject;
import com.gilfoyle.design.behavioral.visitor.code.Visitor;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:19
 */
public class VisitorTest {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}
}
