package com.gilfoyle.design.creational.prototype.deep;

import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-07-15 14:05
 */
@Data
public class DeepPrototype implements Cloneable, Serializable {
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private List<String> hobbies;
	
	/**
	 * 浅克隆
	 *
	 * @return
	 */
	@Override
	public DeepPrototype clone() {
		try {
			return (DeepPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 深克隆
	 *
	 * @return
	 */
	public DeepPrototype deepClone() {
		try {
			//序列化
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			
			//反序列化
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (DeepPrototype) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 硬编码 深克隆 （不推荐）
	 * @return
	 */
	public DeepPrototype deepCloneHobbies() {
		
		try {
			DeepPrototype result = (DeepPrototype) super.clone();
			
			result.hobbies = (List) ((ArrayList)result.hobbies).clone();
			
			
			return result;
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	@Override
	public String toString() {
		return "DeepPrototype{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", gender='" + gender + '\'' +
				       ", hobbies=" + hobbies +
				       '}';
	}
}
