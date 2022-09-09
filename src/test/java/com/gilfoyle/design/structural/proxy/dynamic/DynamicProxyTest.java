package com.gilfoyle.design.structural.proxy.dynamic;

import com.gilfoyle.design.structural.proxy.dynamic.dyproxy.DynProxyFactory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:51
 */
public class DynamicProxyTest {
	public static void main(String[] args) {
		LawSuit lawSuit = (LawSuit)DynProxyFactory.getDynProxy(new CuiHuaNiu());
		lawSuit.lawsuit("之前的工资流水在此，请法官过目");
		lawSuit.defend();
	}
}
