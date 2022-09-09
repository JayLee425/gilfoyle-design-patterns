package com.gilfoyle.design.structural.proxy.cglib.test;

import com.gilfoyle.design.structural.proxy.cglib.Frank;
import com.gilfoyle.design.structural.proxy.cglib.cgproxy.CgLibDynProxyFactory;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:28
 */
public class CglibDynProxyTest {
	public static void main(String[] args) {
		Frank frankProxy = (Frank) CgLibDynProxyFactory.getCglibDybProxy(new Frank());
		frankProxy.submit("之前的工资流水在此");
		frankProxy.defend();
	}
}
