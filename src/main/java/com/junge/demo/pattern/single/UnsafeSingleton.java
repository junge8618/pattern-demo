/**
 * 
 */
package com.junge.demo.pattern.single;

/**
 * 不安全单例模式
 * 多并发使用时可能会创建多个实例
 * @author liuxj
 * @date 2018年6月23日
 */
public class UnsafeSingleton {

	private static UnsafeSingleton instance;
	
	private UnsafeSingleton() {
		
	}
	
	public static UnsafeSingleton getInstance() {
		if (null == instance) {
			instance = new UnsafeSingleton();
		}
		
		return instance;
	}
	
}
