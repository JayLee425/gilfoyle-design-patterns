package com.gilfoyle.design.structural.adapter.classs.test;

import com.gilfoyle.design.structural.adapter.classs.AdapterClass;
import com.gilfoyle.design.structural.adapter.classs.TargetAble;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-06 23:05
 */
public class ClassAdapterTest {
	
	public static void main(String[] args) {
		TargetAble adapterClass = new AdapterClass();
		// 老功能
		adapterClass.checkUser();
		
		// 新功能
		adapterClass.verifyUser();
		
	}
}
