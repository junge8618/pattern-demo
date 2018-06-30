/**
 * 
 */
package com.junge.demo.pattern.create.single;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁单例
 * 
 * @author liuxj
 * @date 2018年6月23日
 */
public class ReentrantLockSingleton {
	private static ReentrantLockSingleton instance;

	private static final ReentrantLock lock = new ReentrantLock();

	private ReentrantLockSingleton() {

	}

	public static ReentrantLockSingleton getInstance() {
		if (null == instance) {
			lock.lock();
			if (null == instance) {
				instance = new ReentrantLockSingleton();
			}
			lock.unlock();
		}

		return instance;
	}
}
