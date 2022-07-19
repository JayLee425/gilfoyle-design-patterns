package com.gilfoyle.design.creational.factory.abstract_factory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 13:30
 */

/**
 * 1、没有公共逻辑，用接口
 * 2、有公共逻辑，用抽象类
 */
public abstract class AbstractCourseFactory {
	
	public void init() {
		System.out.println("初始化基础数据");
	}
	
	protected abstract INote createNote();
	
	protected abstract IVideo createVideo();
}
