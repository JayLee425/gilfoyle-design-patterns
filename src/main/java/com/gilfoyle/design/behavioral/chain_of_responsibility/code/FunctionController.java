package com.gilfoyle.design.behavioral.chain_of_responsibility.code;

import com.gilfoyle.design.behavioral.chain_of_responsibility.code.tools.ChainPatternDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:32
 */
@RestController
@RequestMapping("/check")
public class FunctionController {
	
	@Resource
	private ChainPatternDemo chainPatternDemo;
	
	@RequestMapping("/testHandler")
	public  void testHandler(HttpServletRequest req, HttpServletResponse resp){
		//调用责任链
		chainPatternDemo.exec(req,resp);
	}
}
