package com.junge.demo.pattern.create.abstractfactory.unix;

import com.junge.demo.pattern.create.abstractfactory.AbstractFactory;
import com.junge.demo.pattern.create.abstractfactory.Button;
import com.junge.demo.pattern.create.abstractfactory.Text;

public class UnixFactory implements AbstractFactory {

	public Button createButton() {
		return new UnixButton();
	}

	public Text createText() {
		return new UnixText();
	}

}
