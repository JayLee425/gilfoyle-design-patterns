package com.gilfoyle.design.creational.builder.test;

import com.gilfoyle.design.creational.builder.example.LombokBean;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-16 18:24
 */
public class LombokBeanBuilderTest {
	public static void main(String[] args) {
		LombokBean lombokBean = LombokBean.builder().name("唐三").age(18).build();
		System.out.println(lombokBean);
	}
}
