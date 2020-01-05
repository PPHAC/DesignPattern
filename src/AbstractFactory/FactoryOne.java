package AbstractFactory;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description todo
 */
public class FactoryOne implements AbstractFactory {

	@Override
	public ProductA createProductA() {

		return new ProductAone();
	}

	@Override
	public ProductB createProductB() {

		return new ProductBone();
	}
}
