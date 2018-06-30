/**
 * 
 */
package com.junge.demo.pattern.single;

import java.util.concurrent.CountDownLatch;

import com.junge.demo.pattern.create.single.UnsafeSingleton;

/**
 * 描述类功能
 * @author liuxj
 * @date 2018年6月23日
 */
public class UnsafeSingletonTest {

	private static final int count = 10;
	
	public static void main(String[] args) {
		// 开10个线程，同时获取单例实例，在线程中输出实例地址
		CountDownLatch latch = new CountDownLatch(count);
		for (int i=0; i<count; i++) {
			new Thread(new GetInstance(latch)).start();
			latch.countDown();
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class GetInstance implements Runnable {
	
	private CountDownLatch latch;
	
	public GetInstance(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(UnsafeSingleton.getInstance());
	}
}
