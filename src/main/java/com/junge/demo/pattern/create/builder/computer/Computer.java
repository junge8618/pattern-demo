package com.junge.demo.pattern.create.builder.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑实体
 * @author liuxj
 *
 */
public class Computer {
	
	/**
	 * 电脑组件列表
	 */
	private List<String> components = new ArrayList<String>();
	
	public void addComponent(String component) {
		this.components.add(component);
	}
	
	public void show() {
		for (String component : components) {
			System.out.println("已经获取组件:" + component);
		}
	}
}
