package com.tpe.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch1 {

	public static void main(String[] args) {
		/*
		 * gerekli servislerim isini yapana kadar main taskim bekledi.
		 */
		
		CountDownLatch latch = new CountDownLatch(4);

		WorkerThread worker1 = new WorkerThread("Worker=1",20000, latch);
		WorkerThread worker2 = new WorkerThread("Worker=2",25000, latch);
		WorkerThread worker3 = new WorkerThread("Worker=3",30000, latch);
		WorkerThread worker4 = new WorkerThread("Worker=4",35000, latch);

		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" has finished");
	}

}

class WorkerThread extends Thread{
	
	private int delay;
	
	private CountDownLatch latch;

	public WorkerThread(String name,int delay, CountDownLatch latch) {
		super(name);
		this.delay=delay;
		this.latch=latch;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			// worker thread`in hangi taski yapmasini istiyorsak onlar burada olacak
			System.out.println(Thread.currentThread().getName()+" is running");
			latch.countDown();
			
			System.out.println(Thread.currentThread().getName()+" finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
