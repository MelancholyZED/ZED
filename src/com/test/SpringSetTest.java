package com.test;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.*;

public class SpringSetTest {
  public static void main(String[] args) {
	//创建Spring的上下文关系对象
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
	  SetBiz lbiz=(SetBiz)ctx.getBean("setbiz");
	  Set<String> lsst=lbiz.getMyset();
	  for(String str:lsst){
		  System.out.println(str);
	  }
}
}
