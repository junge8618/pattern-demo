package com.junge.demo.pattern.create.abstractfactory.window;

import com.junge.demo.pattern.create.abstractfactory.AbstractFactory;
import com.junge.demo.pattern.create.abstractfactory.Button;
import com.junge.demo.pattern.create.abstractfactory.Text;

public class WindowFactory implements AbstractFactory {

	public Button createButton() {
		
		return new WindowButton();
	}

	public Text createText() {
		
		return new WindowText();
	}

}
