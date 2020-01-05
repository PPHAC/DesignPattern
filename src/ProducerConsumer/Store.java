package ProducerConsumer;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class Store {

	protected int Maxsize;
	protected LinkedList<Date> data;

	public Store(int maxsize) {
		this.Maxsize = maxsize;
		this.data = new LinkedList<>();
	}

	public  void put() {
		synchronized(data) {
			while(data.size() == Maxsize) {
				try {
					data.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			data.add(new Date());
			System.out.println("剩余" + data.size() + "个产品");
			data.notify();
		}
	}

	public synchronized void take() {
		while (data.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data.remove();
		System.out.println("剩余" + data.size() + "个产品");
		notify();
	}

}
