package com.junge.demo.pattern.create.abstractfactory;

public interface AbstractFactory {

	/**
	 * 创建按钮对象
	 * @return
	 */
	Button createButton();
	
	/**
	 * 创建文本对象
	 * @return
	 */
	Text createText();
}
