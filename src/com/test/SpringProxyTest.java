package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.*;

public class SpringProxyTest {
  public static void main(String[] args) {
	//创建Spring的上下文关系对象
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
	  //获取注入实现类对象，为接口赋值，称为接口注入
	  /*IUsersDao usao=(IUsersDao)ctx.getBean("daoproxy");*/
	  IUsersDao usao=(IUsersDao)ctx.getBean("daoCGLIBproxy");
	  usao.save();
}
}
