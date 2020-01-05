package ProducerConsumer;

import Factory.Product;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class Producer implements Runnable{

	private Store store;
	public Producer(Store _store) {
		this.store = _store;
	}
	@Override
	public void run() {
		int flag = 100;
		while(flag-- > 0) {
			this.store.put();
		}
	}
}
