/**
 * 
 */
package com.junge.demo.pattern.create.single;

/**
 * synchronized修饰的同步单例
 * 并发安全，但是性能差
 * @author liuxj
 * @date 2018年6月23日
 */
public class SynchroinzedSingleton {
	
	private static SynchroinzedSingleton instance;

	private SynchroinzedSingleton() {

	}

	public static synchronized SynchroinzedSingleton getInstance() {
		if (null == instance) {
			instance = new SynchroinzedSingleton();
		}

		return instance;
	}
}
