package com.test;

import java.util.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.*;

public class SpringMapTest {
  public static void main(String[] args) {
	//创建Spring的上下文关系对象
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
	  MapBiz lbiz=(MapBiz)ctx.getBean("mapbiz");
	  Map<String,Object> lsst=lbiz.getMymap();
	  for(String key:lsst.keySet()){
		  System.out.println(key+":"+lsst.get(key));
	  }
}
}
