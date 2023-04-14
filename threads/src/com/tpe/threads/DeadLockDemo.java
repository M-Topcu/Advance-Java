package com.tpe.threads;

public class DeadLockDemo {
	/*
	 * thread1 ve thread 2 biri lock1 biri lock2 aldi
	 * sonra ikisi de diger lock`i almaya calisti ama diger thread tarafindan alindigini gordu
	 * ikisi de biribini bekler hale geldi ve deadlock oldu
	 * JDK Mission Controle bakarsak 2 thread de blocked durumda 
	 * deadlock detectiona tiklarsak true goruruz jdk mc`de
	 */

	public static void main(String[] args) {
		
		final String lock1 = "lock1";
		final String lock2 = "lock2";
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread1: locked the lock1");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (lock2) {
						System.out.println("Thread1: locked the lock2");
						}
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("Thread1: locked the lock2");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (lock1) {
						System.out.println("Thread1: locked the lock1");
						}
				}
				
			}
		});
		thread1.start();
		thread2.start();

	}

}
