package com.gilfoyle.design.structural.proxy.statics;

/**
 * @author jaylee
 * @description: 代理律师诉讼类，实现ILawSuit接口
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:17
 */
public class ProxyLawyer implements ILawSuit {
	/**
	 * 原告（持有要代理的哪个对象）
	 */
	private ILawSuit plaintiff;
	
	public ProxyLawyer(ILawSuit iLawSuit) {
		this.plaintiff = iLawSuit;
	}
	
	@Override
	public void lawsuit(String proof) {
		plaintiff.lawsuit(proof);
	}
	
	@Override
	public void defend() {
		this.plaintiff.defend();
	}
}
