package com.gilfoyle.design.creational.factory.simple.test;


import com.gilfoyle.design.creational.factory.simple.CourseFactory;
import com.gilfoyle.design.creational.factory.simple.ICourse;
import com.gilfoyle.design.creational.factory.simple.JavaCourse;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 12:05
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		//Course course = new Course();
		//course.record();
		
		//ICourse java = new CourseFactory().create("java");
		//java.record();
		
		//ICourse iCourse = new CourseFactory().create("com.gilfoyle.design.creational.factory.simple.JavaCourse");
		//iCourse.record();
		
		ICourse iCourse = new CourseFactory().create(JavaCourse.class);
		iCourse.record();
	}
}
