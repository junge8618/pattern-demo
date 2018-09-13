/**
 * 
 */
package com.junge.demo.pattern.observer.jdk;

/**
 * @author "liuxj"
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyObservable observable = new MyObservable();
		for (int i=0; i<10; i++) {
			observable.addObserver(new MyObserver("name" + i));
		}

		observable.update("內容");
		observable.update("內容1");
		
	}

}
