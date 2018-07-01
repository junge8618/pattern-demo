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
public class SimpleFactory {

	public static Car getBydCar() {
		return new BydCar();
	}
	
	public static Car getXialiCar() {
		return new XialiCar();
	}
}
