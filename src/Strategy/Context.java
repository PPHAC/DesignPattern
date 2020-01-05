package Strategy;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class Context {
	private Strategy strategy = null ;

	public Context(Strategy _strategy) {
		strategy = _strategy;
	}

	public void doSomething() {
		this.strategy.doSomething();
	}

}
