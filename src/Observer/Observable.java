package Observer;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public interface Observable {
	void addObserver(Observer observer);

	void deleteObserver(Observer observer);

	void notifyObserver(String message);

}
