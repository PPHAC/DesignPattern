package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class Pphac implements Human, Observable {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void eat() {
		System.out.println("pphac is eatting");
		this.notifyObserver("pphac is eatting");
	}

	@Override
	public void drink() {
		System.out.println("pphac is drinking");
		this.notifyObserver("pphac is drinking");
	}

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String message) {
		for (Observer oberver : this.observerList) {
			oberver.updata(message);
		}
	}
}
