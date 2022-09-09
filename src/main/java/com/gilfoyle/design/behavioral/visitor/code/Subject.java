package com.gilfoyle.design.behavioral.visitor.code;

/**
 * @author jaylee
 * @description: Subject类
 *              accept方法，接受将要访问它的对象;
 *              getSubject()获取将要被访问的属性。
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:15
 */
public interface Subject {
	void accept(Visitor visitor);
	String getSubject();
}
