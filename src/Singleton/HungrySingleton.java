package Singleton;

/**
 * @Author pphac
 * @Date 2019/11/26
 * @Description todo
 */
public class HungrySingleton {

	private static final  HungrySingleton instance  = new HungrySingleton();

	private HungrySingleton() {}

	public static HungrySingleton getInstance() {

		return instance;
	}
}
