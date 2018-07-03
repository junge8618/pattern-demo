/**
 * 
 */
package com.junge.demo.pattern.create.single;

/**
 * 静态内部类单例
 * @author "liuxj"
 *
 */
public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {
		
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return StaticInnerClassSingletonInner.singleton;
	}
	
	static class StaticInnerClassSingletonInner {
		private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}
}
