package com.gilfoyle.design.creational.builder.test;

import com.gilfoyle.design.creational.builder.example.Person;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-16 18:17
 */
public class BuilderTest {
	public static void main(String[] args) {
		Person.Builder builder = Person.builder();
		Person person = builder.name("石昊")
				                .age(21)
				                .build();
		
		System.out.println(person);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println("==========");
		
		Person buildPerson = Person.builder()
				                     .name("荒天帝-石昊")
				                     .age(19)
				                     .build();
		System.out.println(buildPerson);
	}
}
