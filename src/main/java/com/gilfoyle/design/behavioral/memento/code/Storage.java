package com.gilfoyle.design.behavioral.memento.code;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jaylee
 * @description: todo 存储备忘录，可以根据原发器需要进行恢复和撤销操作等
 * @author: Mr.JayLee
 * @create: 2022-09-09 21:01
 */
@Data
@AllArgsConstructor
public class Storage {
	private Memento memento;
}
