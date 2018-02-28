package com.lms.mvc.hdler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     * @return
     */
	@RequestMapping("index")
	public String ind(){
		return "index1";
	}
    @RequestMapping("helloworld")
    public String hello(){
//        System.out.println("hello world");
    	
//        return new ModelAndView("success");
//    	return new ModelAndView("WEB-INF/views/success.jsp");
    	
//    	Class c=org.springframework.web.servlet.DispatcherServlet.class;    	
    	Class c=DispatcherServlet.class;
//    	return new ModelAndView("index1.jsp","error","lms error4");
    	return "success";
    }
}