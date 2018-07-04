/**
 * 
 */
package com.junge.demo.pattern.create.builder.computer;

/**
 * @author liuxj
 *
 */
public class Director {

	public static void build(ComputerBuilder builder) {
		builder.buildCpu();
		
		builder.buildHd();
		
		builder.buildMainborad();
		
		builder.buildMemory();
	}
}
