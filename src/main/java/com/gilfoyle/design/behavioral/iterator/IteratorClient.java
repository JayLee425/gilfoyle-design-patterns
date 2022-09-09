package com.gilfoyle.design.behavioral.iterator;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 20:27
 */
public class IteratorClient {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
