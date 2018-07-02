/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod;

import com.junge.demo.pattern.create.factorymethod.factory.ExportExclFileFactory;

/**
 * @author "liuxj"
 *
 */
public class Main {

	public static void main(String[] args) {
		ExportFactory factory = new ExportExclFileFactory();
		factory.factory("stand").export();
	}
}
