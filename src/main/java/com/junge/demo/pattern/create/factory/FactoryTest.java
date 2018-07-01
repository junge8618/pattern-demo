/**
 * 
 */
package com.junge.demo.pattern.create.factory;

import com.junge.demo.pattern.create.factory.impl.BydCar;
import com.junge.demo.pattern.create.factory.impl.XialiCar;

/**
 * 描述类功能
 * @author liuxj
 * @date 2018年7月1日
 */
public class FactoryTest {

	public static void main(String[] args) {
		SimpleFactory.getBydCar().printName();
		SimpleFactory.getXialiCar().printName();

		SimpleFactory1.createCar("xiali").printName();
		SimpleFactory1.createCar("byd").printName();
		
		SimpleFactory2.createCar(XialiCar.class).printName();
		SimpleFactory2.createCar(BydCar.class).printName();
	}

}
