package com.gilfoyle.design.creational.factory.abstract_factory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 13:35
 */
public class JavaNote implements INote{
	@Override
	public void edit() {
		System.out.println("Java Note 笔记");
	}
}
