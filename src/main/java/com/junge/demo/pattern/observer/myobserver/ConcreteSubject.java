/**
 * 
 */
package com.junge.demo.pattern.observer.myobserver;

/**
 * @author "liuxj"
 *
 */
public class ConcreteSubject extends Subject {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.junge.demo.pattern.observer.Subject#change()
	 */
	@Override
	protected void change() {
		this.setName("修改");
		notifyObservers(this.getName());

	}

	@Override
	public String toString() {
		return "ConcreteSubject [name=" + name + "]";
	}
}
