package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object object = null;

	public MyInvocationHandler(Object _object) {
		this.object = _object;
	}

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.object,args);
		return result;
	}
}
