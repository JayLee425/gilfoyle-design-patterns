package com.gilfoyle.design.behavioral.memento.test;

import com.gilfoyle.design.behavioral.memento.code.Original;
import com.gilfoyle.design.behavioral.memento.code.Storage;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 21:03
 */
public class MementoTest {
	public static void main(String[] args) {
		
		// 创建原始类
		Original origi = new Original("egg");
		
		// 创建备忘录 并存储到 Storage中
		Storage storage = new Storage(origi.createMemento());
		
		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getValue());
		origi.setValue("niu");
		System.out.println("修改后的状态为：" + origi.getValue());
		
		// 回复原始类的状态（相当于撤销功能的意思）
		origi.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + origi.getValue());
	}
}
