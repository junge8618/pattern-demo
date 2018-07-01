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
public class SimpleFactory1 {

	public static Car createCar(String carbrand) {
		if ("byd".equalsIgnoreCase(carbrand)) {
			return new BydCar();
		}
		
		if ("xiali".equalsIgnoreCase(carbrand)) {
			return new XialiCar();
		}
		
		return null;
	}
}
