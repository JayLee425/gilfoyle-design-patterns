package com.gilfoyle.design.structural.decorator.design;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-07 00:08
 */
public class Decorator implements SourceInterface{
	
	private Source source;
	
	public Decorator(Source source){
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("before decorator optional ! ");
		System.out.println();
		this.source.method();
		System.out.println();
		System.out.println("after decorator optional !!! ");
	
	}
}
