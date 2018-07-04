package com.junge.demo.pattern.create.builder.computer;

public abstract class Builder {

	public abstract void buildCpu();
	
	public abstract void buildMainborad();
	
	public abstract void buildMemory();
	
	public abstract void buildHd();
	
	public abstract Computer getComputer();
}
