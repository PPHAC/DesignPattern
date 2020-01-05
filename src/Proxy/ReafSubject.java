package Proxy;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class ReafSubject implements Subject {
	@Override
	public void doSomething(String str) {
		System.out.println(str);
	}
}
