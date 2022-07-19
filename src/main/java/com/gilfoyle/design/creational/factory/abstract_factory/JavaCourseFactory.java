package com.gilfoyle.design.creational.factory.abstract_factory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 13:36
 */
public class JavaCourseFactory extends AbstractCourseFactory{
	@Override
	public INote createNote() {
		init();
		return new JavaNote();
	}
	
	@Override
	public IVideo createVideo() {
		init();
		return new JavaVideo();
	}
}
