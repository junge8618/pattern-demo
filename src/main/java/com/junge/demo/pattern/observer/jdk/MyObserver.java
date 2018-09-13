/**
 * 
 */
package com.junge.demo.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author "liuxj"
 *
 */
public class MyObserver implements Observer {
	
	private String name;
	
	public MyObserver(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		System.out.println(this.name + " 主题:" + o + "参数:" + arg);

	}

}
