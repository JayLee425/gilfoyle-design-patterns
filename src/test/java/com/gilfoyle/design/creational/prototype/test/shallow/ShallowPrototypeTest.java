package com.gilfoyle.design.creational.prototype.test.shallow;

import com.gilfoyle.design.creational.prototype.shallow.ShallowPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 14:11
 */
public class ShallowPrototypeTest {
	public static void main(String[] args) {
		// 创建原型对象
		ShallowPrototype prototype = new ShallowPrototype();
		prototype.setGender("男");
		prototype.setName("Jimmy");
		prototype.setAge(19);
		List<String> hobbies = new ArrayList<>();
		hobbies.add("篮球");
		hobbies.add("象棋");
		hobbies.add("健身");
		prototype.setHobbies(hobbies);
		System.out.println("before clone 原型对象 " + prototype);
		
		// 拷贝原型对象
		ShallowPrototype cloneObj = prototype.clone();
		cloneObj.getHobbies().add("技术控");
		
		System.out.println("after clone 原型对象 " + prototype);
		System.out.println(cloneObj);
		
		System.out.println(prototype == cloneObj);
		System.out.println("原型对象的爱好  -> " + prototype.getHobbies());
		System.out.println("clone对象的爱好 -> " + cloneObj.getHobbies());
		
	}
}
