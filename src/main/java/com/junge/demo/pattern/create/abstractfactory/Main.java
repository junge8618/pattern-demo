/**
 * 
 */
package com.junge.demo.pattern.create.abstractfactory;

/**
 * @author "liuxj"
 *
 */
public class Main {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProvider.getFactory("unix");
		
		factory.createButton().draw();
		factory.createText().write();
		
		factory = FactoryProvider.getFactory("window");
		
		factory.createButton().draw();
		factory.createText().write();
	}
}
