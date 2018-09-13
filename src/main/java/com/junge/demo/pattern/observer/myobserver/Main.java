/**
 * 
 */
package com.junge.demo.pattern.observer.myobserver;

/**
 * @author "liuxj"
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		subject.addObserver(new Concrete1Observer()).addObserver(new Concrete2Observer());
		
		subject.change();

	}

}
