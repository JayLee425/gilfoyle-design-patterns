package com.gilfoyle.design.creational.factory.abstract_factory.test;


import com.gilfoyle.design.creational.factory.abstract_factory.JavaCourseFactory;
import com.gilfoyle.design.creational.factory.abstract_factory.PythonCourseFactory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 13:39
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		JavaCourseFactory factory = new JavaCourseFactory();
		factory.createNote().edit();
		factory.createVideo().record();
		
		PythonCourseFactory pythonFactory = new PythonCourseFactory();
		pythonFactory.createNote().edit();
		pythonFactory.createVideo().record();
	}
}
