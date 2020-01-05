package Observer;

/**
 * @Author pphac
 * @Date 2019/11/28
 * @Description todo
 */
public class ObserverTwo implements Observer {
	@Override
	public void updata(String message) {
		System.out.println("2号收到消息：" + message);
	}
}
