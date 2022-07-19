package com.gilfoyle.design.creational.builder.example;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-16 18:12
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       '}';
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private String name;
		private int age;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
}
