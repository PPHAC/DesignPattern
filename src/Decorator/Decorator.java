package Decorator;

/**
 * @Author pphac
 * @Date 2019/11/29
 * @Description todo
 */
public abstract class Decorator extends Component {

	private Component component;
	
	private String des = "装饰";

	public Decorator(Component _component) {
		this.component = _component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}
}
