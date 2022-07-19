package com.gilfoyle.design.creational.factory.simple;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 12:14
 */
public class CourseFactory {
	
	public ICourse create(Class clazz) {
		//// name 可能传错
		//if ("java".equalsIgnoreCase(name)) {
		//	return new JavaCourse();
		//} else if ("python".equalsIgnoreCase(name)) {
		//	return new PythonCourse();
		//}
		//return null;
		
		
		//try {
		//	if (!(null == className || "".equals(className))) {
		//		return (ICourse) Class.forName(className).newInstance();
		//	}
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
		//return null;
		
		try {
			if (null != clazz) {
				return (ICourse) clazz.newInstance();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
