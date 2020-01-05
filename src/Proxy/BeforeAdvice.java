package Proxy;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class BeforeAdvice implements IAdvice {
	@Override
	public void exec() {
		System.out.println("前置通知");
	}
}
