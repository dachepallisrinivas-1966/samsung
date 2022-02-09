/* synchronization */

package com.samsung.ui;

class Data {
	/* synchronized */ public void print() {
		
		synchronized (this) { 
			for(int i=1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName() + " => " + i);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException excep) {
					System.out.println(excep.getMessage());
				}
			}
		}
		
	}
}

class SyncThread extends Thread {
	Data data;
	public SyncThread(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.print();
	}
}

public class App04 {

	public static void main(String[] args) {
		Data obj = new Data();
		SyncThread threadOne, threadTwo;
		threadOne = new SyncThread(obj);
		threadOne.setName("Thread 1");
		threadOne.setPriority(10);
		threadTwo = new SyncThread(obj);
		threadTwo.setName("Thread 2");
		threadTwo.setPriority(1);
		threadOne.start();
		threadTwo.start();
	}

}