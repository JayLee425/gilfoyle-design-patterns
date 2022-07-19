package com.gilfoyle.design.creational.factory.factory_method;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 12:40
 */
public class JavaCourseFactory implements ICourseFactory{
	@Override
	public ICourse create() {
		return new JavaCourse();
	}
}
