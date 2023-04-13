package com.tpe.threads;

public class Volatile {
	
	volatile public static int flag = 0;

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					if(flag==0) {
						System.out.println("Thread1 running");
					}else break;
				}
			}
		});
		thread1.start();
		
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag=1;
				
				System.out.println("Value of thread is updated");
				// flag 1 olana kadar calisti, volatile olmasa sonsuz loopa girebilirdi
			}
		});
		thread2.start();
		
	}
}
