package com.gilfoyle.design.behavioral.memento.code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 21:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Original {
	private String value;
	
	public Memento createMemento(){
		return new Memento(value);
	}
	
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
}
