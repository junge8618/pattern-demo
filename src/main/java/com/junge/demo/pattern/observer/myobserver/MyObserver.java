package com.junge.demo.pattern.observer.myobserver;

/**
 * https://www.cnblogs.com/walkinhalo/p/9638457.html
 * 观察者属于行为型模式的一种, 又叫发布-订阅模式. 如果一个对象的状态发生改变,依赖他的对象都将发生变化, 那么这种情况就适合使用观察者模式.

它包含两个术语,主题(Subject),观察者(Observer), 主题管理一个观察者的列表, 并在状态发生变化时通知到他们.

实现层面上, 主题定义了一个观察者列表并可以管理这个列表(将观察者注册进去和撤销注册的行为), 同时定义了通知到所有观察者的行为.

Java类库有默认的观察者实现类Observer. 使用观察者模式的还有事件监听, RxJava等.
 * @author "liuxj"
 *
 */
public interface MyObserver {

	void update(Subject subject, Object arg);
}
