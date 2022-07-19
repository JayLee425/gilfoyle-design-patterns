package com.gilfoyle.design.creational.factory.abstract_factory;


/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 12:13
 */
public class JavaCourse implements ICourse {
	@Override
	public void record() {
		System.out.println("录制Java课程视频");
	}
}
