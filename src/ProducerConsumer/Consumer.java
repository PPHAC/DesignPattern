package ProducerConsumer;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class Consumer implements Runnable {
	private Store store;

	public Consumer(Store _store) {
		this.store = _store;
	}

	@Override
	public void run() {
		int flag = 100;
		while (flag-- > 0) {
			this.store.take();
		}
	}
}
