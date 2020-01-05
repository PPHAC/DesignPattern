package Factory;

/**
 * @Author pphac
 * @Date 2019/11/26
 * @Description todo
 */
public abstract class AbstractFactory {

	public abstract <T extends Product> T createProduct(Class<T> c);

}
