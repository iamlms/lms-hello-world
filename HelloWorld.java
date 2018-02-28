package com.lms.mvc.hdler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

    /**
     * 1. ʹ��RequestMappingע����ӳ�������URL
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ����InternalResourceViewResolver��ͼ���������������½���
     * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
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