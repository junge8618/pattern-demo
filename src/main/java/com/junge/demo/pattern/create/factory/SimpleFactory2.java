/**
 * 
 */
package com.junge.demo.pattern.create.factory;

/**
 * 描述类功能
 * @author liuxj
 * @date 2018年7月1日
 */
public class SimpleFactory2 {

	public static <T extends Car> Car createCar(Class<T> cls) {
		
		try {
			return (Car)cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
