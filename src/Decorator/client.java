package Decorator;

/**
 * @Author pphac
 * @Date 2019/11/29
 * @Description todo
 */
public class client {
    public static void main(String[] args) {
        Component component = new ComponentImpl();
        component = new DecoratorImpl1(component);
        component = new DecoratorImpl2(component);
        component.operate();
        int i = 1;

    }
}
