package com.gilfoyle.design.behavioral.chain_of_responsibility.code;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jaylee
 * @description: 定义一个接口或者抽象类
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:04
 */
public abstract class AbstractHandler {
	/**
	 * 责任链的下一个对象
	 */
	private AbstractHandler nextHandler;
	
	//具体参数拦截逻辑,给子类去实现
	public void filter(HttpServletRequest request, HttpServletResponse response){
		/**
		 * 执行当前链
		 */
		doFilter(request,response);
		//如果还有下个链，执行下个链
		//if (!Objects.isNull(getNextHandler())){
		//	getNextHandler().doFilter(request, response);
		//}
	}
	
	//获取下一个链对象
	public AbstractHandler getNextHandler(){
		return nextHandler;
	}
	
	//set责任链的下一个对象
	public void setNextHandler(AbstractHandler next){
		this.nextHandler = next;
	}
	
	protected abstract void doFilter(HttpServletRequest request, HttpServletResponse response);
}
