package com.gilfoyle.design.structural.adapter.object;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-06 23:16
 */
public class WrapperObject implements TargetObject{
	
	private Source source;
	
	public WrapperObject(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("兼容老的 method 方法");
		source.method();
	
	}
	
	@Override
	public void methodNew() {
		System.out.println("this is object adapter design patterns WrapperObject#methodNew");
	}
}
