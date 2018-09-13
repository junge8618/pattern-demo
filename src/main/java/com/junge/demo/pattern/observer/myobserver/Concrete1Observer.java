/**
 * 
 */
package com.junge.demo.pattern.observer.myobserver;

/**
 * @author "liuxj"
 *
 */
public class Concrete1Observer implements MyObserver {

	/* (non-Javadoc)
	 * @see com.junge.demo.pattern.observer.MyObserver#update(com.junge.demo.pattern.observer.Subject)
	 */
	public void update(Subject subject, Object arg) {
		System.out.println("Concrete1Observer update subject=" + subject + ",arg=" + arg);

	}

}
