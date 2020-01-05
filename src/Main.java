//import Factory.AbstractFactory;
//import Factory.Factory;
//import Factory.Product;
//import Factory.ProductOne;
//import Factory.ProductTwo;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryOne;
import AbstractFactory.FactoryTwo;
import AbstractFactory.ProductA;
import AbstractFactory.ProductB;
import AbstractFactory.ProductAone;
import AbstractFactory.ProductAtwo;
import AbstractFactory.ProductBone;
import AbstractFactory.ProductBtwo;
import Observer.Human;
import Observer.Observer;
import Observer.Pphac;
import ProducerConsumer.Consumer;
import ProducerConsumer.Producer;
import ProducerConsumer.Store;
import Singleton.EnumSingleton;
import Strategy.Context;
import Strategy.Strategy;
import Strategy.StrategyOne;
import Strategy.StrategyTwo;
import Template.AbstractClass;
import Template.ClassOne;
import Template.ClassTwo;
import Observer.ObserverOne;
import Observer.ObserverTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;


public class Main {

	public static void main(String[] args) {

//        AbstractFactory abstractFactory1 = new FactoryOne();
//        AbstractFactory abstractFactory2 = new FactoryTwo();
//        ProductA productA1 = abstractFactory1.createProductA();
//        productA1.price();
//        ProductA productA2 = abstractFactory2.createProductA();
//        productA2.price();

//        AbstractClass abstractClassOne = new ClassOne();
//        AbstractClass abstractClassTwo = new ClassTwo();
//        abstractClassOne.template();
//        abstractClassTwo.template();
//        Context context1 = new Context(new StrategyOne());
//        Context context2 = new Context(new StrategyTwo());
//        context1.doSomething();
//        context2.doSomething();

//        Observer observer1 = new ObserverOne();
//        Observer observer2 = new ObserverTwo();
//
//        Pphac tiancai = new Pphac();
//        tiancai.addObserver(observer1);
//        tiancai.addObserver(observer2);
//
//        tiancai.eat();
//        tiancai.drink();

		Store store = new Store(10);
		Consumer consumer = new Consumer(store);
		Producer producer = new Producer(store);
		new Thread(producer).start();
		new Thread(consumer).start();
		

		EnumSingleton.Instance.doSomething();

		ArrayList a = new ArrayList();
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		HashSet<String> hashSet = new HashSet<>();
		ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
		Comparable


	}
}
