/**
 * 
 */
package com.junge.demo.pattern.create.builder.computer;

/**
 * 电脑组件构造者
 * @author liuxj
 *
 */
public class ComputerBuilder extends Builder {

	private Computer computer = new Computer();
	
	@Override
	public Computer getComputer() {
		return this.computer;
	}

	@Override
	public void buildCpu() {
		computer.addComponent("CPU");
		
	}

	@Override
	public void buildMainborad() {
		computer.addComponent("主板");
		
	}

	@Override
	public void buildMemory() {
		computer.addComponent("内存条");
		
	}

	@Override
	public void buildHd() {
		computer.addComponent("硬盘");
		
	}
}
