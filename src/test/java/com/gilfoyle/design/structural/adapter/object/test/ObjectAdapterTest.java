package com.gilfoyle.design.structural.adapter.object.test;

import com.gilfoyle.design.structural.adapter.object.Source;
import com.gilfoyle.design.structural.adapter.object.TargetObject;
import com.gilfoyle.design.structural.adapter.object.WrapperObject;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-06 23:21
 */
public class ObjectAdapterTest {
	public static void main(String[] args) {
		
		Source source = new Source();
		
		TargetObject wrapperObject = new WrapperObject(source);
		// 兼容老功能
		wrapperObject.method();
		
		System.out.println();
		
		// 重构扩展之后的方法
		wrapperObject.methodNew();
	}
}
