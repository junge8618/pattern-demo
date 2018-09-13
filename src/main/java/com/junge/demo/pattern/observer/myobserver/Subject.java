/**
 * 
 */
package com.junge.demo.pattern.observer.myobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author "liuxj"
 *
 */
public abstract class Subject {

	private List<MyObserver> observerList = new ArrayList<MyObserver>();
	
	public synchronized Subject addObserver(MyObserver observer) {
		if (!observerList.contains(observer)) {
			observerList.add(observer);
		}
		
		return this;
	}
	
	public synchronized Subject removerObserver(MyObserver observer) {
		if (observerList.contains(observer)) {
			observerList.remove(observer);
		}
		
		return this;
	}
	
	public final void notifyObservers(Object arg) {
		for (MyObserver observer : observerList) {
			observer.update(this, arg);
		}
	}
	
	protected abstract void change();
}
