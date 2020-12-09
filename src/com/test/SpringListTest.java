package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.ListBiz;

public class SpringListTest {
  public static void main(String[] args) {
	//创建Spring的上下文关系对象
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
	  //获取注入实现类对象，为接口赋值，称为接口注入
	  ListBiz lbiz=(ListBiz)ctx.getBean("listbiz");
	  List<String> lsst=lbiz.getMylist();
	  for(String str:lsst){
		  System.out.println(str);
	  }
}
}
