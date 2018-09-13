/**
 * 
 */
package com.junge.demo.pattern.observer.jdk;

import java.util.Observable;

/**
 * @author "liuxj"
 *
 */
public class MyObservable extends Observable {


	public void update(String content) {
		super.setChanged();
		super.notifyObservers(content);
	}
}
