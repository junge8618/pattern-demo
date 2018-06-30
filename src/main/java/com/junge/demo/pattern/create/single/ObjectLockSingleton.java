/**
 * 
 */
package com.junge.demo.pattern.create.single;

/**
 * 对象锁单例，并发安全，效率高
 * @author liuxj
 * @date 2018年6月23日
 */
public class ObjectLockSingleton {
	
	private static ObjectLockSingleton instance;
	
	private static final byte[] lock = new byte[1];
	
	private ObjectLockSingleton() {
		
	}
	
	public static ObjectLockSingleton getInstance() {
		if (null == instance) {
			synchronized (lock) {
				if (null == instance) {
					instance = new ObjectLockSingleton();
				}
			}
		}
		
		return instance;
	}

}
