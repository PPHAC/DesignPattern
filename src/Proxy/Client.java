package Proxy;

import java.lang.reflect.InvocationHandler;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ReafSubject();
		InvocationHandler invocationHandler = new MyInvocationHandler(subject);
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
				subject.getClass().getInterfaces(), invocationHandler);
		proxy.doSomething("hello!");

	}
}
