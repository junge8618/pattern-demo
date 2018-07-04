/**
 * 
 */
package com.junge.demo.pattern.create.builder.computer;

/**
 * @author liuxj
 *
 */
public class Client {

	public static void main(String[] args) {
		ComputerBuilder builder = new ComputerBuilder();
		Director.build(builder);
		
		builder.getComputer().show();
	}
}
