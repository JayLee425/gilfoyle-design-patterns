package com.gilfoyle.design.creational.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 14:05
 */
@Data
public class ShallowPrototype implements Cloneable {
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private List<String> hobbies;
	
	@Override
	public ShallowPrototype clone() {
		try {
			return (ShallowPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "ShallowPrototype{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", gender='" + gender + '\'' +
				       ", hobbies=" + hobbies +
				       '}';
	}
}
