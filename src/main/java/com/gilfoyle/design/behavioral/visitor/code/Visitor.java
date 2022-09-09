package com.gilfoyle.design.behavioral.visitor.code;

/**
 * @author jaylee
 * @description: 一个Visitor类，存放要访问的对象
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:14
 */
public interface Visitor {
	void visit(Subject sub);
}
