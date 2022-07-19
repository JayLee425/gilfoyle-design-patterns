package com.gilfoyle.design.creational.factory.simple;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 12:13
 */
public class PythonCourse implements ICourse{
	@Override
	public void record() {
		System.out.println("录制Python课程视频");
	}
}
