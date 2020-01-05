package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
	                                     InvocationHandler h) {
		if (true) {
			(new BeforeAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
