package com.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

public class DaoInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInterceptor) throws Throwable {
		System.out.println("正在开始日志处理...");
		System.out.println("正在开始安全处理...");
		System.out.println("正在开始事务处理...");
		System.out.println("====================");
		Thread.sleep(3000);
		Object obj=methodInterceptor.proceed();//调用业务方法
		System.out.println("====================");
		System.out.println("正在结束日志处理...");
		System.out.println("正在结束安全处理...");
		System.out.println("正在结束事务处理...");
		return obj;
	}

}
