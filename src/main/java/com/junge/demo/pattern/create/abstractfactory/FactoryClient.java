/**
 * 
 */
package com.junge.demo.pattern.create.abstractfactory;

import com.junge.demo.pattern.create.abstractfactory.unix.UnixFactory;
import com.junge.demo.pattern.create.abstractfactory.window.WindowFactory;

/**
 * @author "liuxj"
 *
 */
public class FactoryClient {

	public static AbstractFactory getFactory(String os) {
		if ("unix".equalsIgnoreCase(os)) {
			return new UnixFactory();
		}
		
		return new WindowFactory();
	}
}
