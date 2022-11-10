package com.gilfoyle.design.behavioral.memento.code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jaylee
 * @description: 原发器，用于创建备忘录，在需要时恢复状态
 * @author: Mr.JayLee
 * @create: 2022-09-09 21:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Original {
	private String value;
	
	/**
	 * 创建备忘录
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(value);
	}
	
	/**
	 * 恢复value的值
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
}
