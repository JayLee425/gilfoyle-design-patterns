package com.gilfoyle.design.behavioral.memento.code;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jaylee
 * @description: todo 备忘录，备份Original的内部 value，在需要时根据备忘录进行恢复。
 * @author: Mr.JayLee
 * @create: 2022-09-09 21:00
 */
@Data
@AllArgsConstructor
public class Memento {
	private String value;
}
