package com.gilfoyle.design.creational.factory.abstract_factory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 13:34
 */
public class PythonVideo implements IVideo{
	@Override
	public void record() {
		System.out.println("python video 视频");
	}
}
