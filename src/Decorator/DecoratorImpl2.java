package Decorator;

/**
 * @Author pphac
 * @Date 2019/11/29
 * @Description todo
 */
public class DecoratorImpl2 extends Decorator {

	public String des = "装饰2";

	public DecoratorImpl2(Component _component) {
		super(_component);
	}

	private void method() {
		System.out.println(this.des);
	}

	@Override
	public void operate() {
		this.method();
		super.operate();
	}
}

