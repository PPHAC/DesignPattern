package Factory;

/**
 * @Author pphac
 * @Date 2019/11/26
 * @Description todo
 */
public class Factory extends AbstractFactory {

	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)product;
	}
}
