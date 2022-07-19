package com.gilfoyle.design.creational.factory.factory_method.test;

import com.gilfoyle.design.creational.factory.factory_method.ICourse;
import com.gilfoyle.design.creational.factory.factory_method.JavaCourseFactory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 12:42
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		JavaCourseFactory factory = new JavaCourseFactory();
		ICourse course = factory.create();
		course.record();
	}
}
