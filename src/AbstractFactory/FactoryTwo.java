package AbstractFactory;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description todo
 */
public class FactoryTwo implements AbstractFactory {
	@Override
	public ProductA createProductA() {

		return new ProductAtwo();
	}

	@Override
	public ProductB createProductB() {

		return new ProductBtwo();
	}
}
