package com.gilfoyle.design.behavioral.chain_of_responsibility.code.tools;

import com.gilfoyle.design.behavioral.chain_of_responsibility.code.AbstractHandler;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author jaylee
 * @description: 对象链连起来（初始化）对象
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:23
 */
@Component("ChainPatternDemo")
public class ChainPatternDemo {
	
	//自动注入各个责任链的对象
	@Resource
	private List<AbstractHandler> abstractHandleList;
	
	private AbstractHandler abstractHandler;
	
	
	//spring注入后自动执行，责任链的对象连接起来
	@PostConstruct
	public void initializeChainFilter(){
		for (int i = 0; i < abstractHandleList.size(); i++) {
			if (i==0){
				//因为上面@Order(1)排过序 所以第一个就是 非空参数检查
				abstractHandler = abstractHandleList.get(0);
			}else {
				AbstractHandler currentHandler = abstractHandleList.get(i - 1);
				AbstractHandler nextHandler = abstractHandleList.get(i);
				currentHandler.setNextHandler(nextHandler);
			}
		}
	}
	
	
	//直接调用这个方法使用,返回最后处理好的response
	public HttpServletResponse exec(HttpServletRequest request,HttpServletResponse response){
		//这里 abstractHandler 就是第一个 接下来就会一个一个向下
		abstractHandler.filter(request,response);
		return response;
	}
}
