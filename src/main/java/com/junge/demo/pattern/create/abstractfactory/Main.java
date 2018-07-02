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

		AbstractFactory factory = FactoryClient.getFactory("unix");
		
		factory.createButton().draw();
		factory.createText().write();
	}
}
