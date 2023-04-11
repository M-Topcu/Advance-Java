package com.tpe.threads;

public class ThreadCreationWays {

	public static void main(String[] args) {
		
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		//Current Thread: main
		
		MyThread thread1=new MyThread();
		
		//thread1.run(); run methodu cagirilarak thread baslatilmaz
		thread1.start();//start methodu ile thread calistirilir. ->RUNNABLE state`e gecer
		
		
		
		MyRunnable runnable = new MyRunnable();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000); // Threadi 5 sn bekletiyor
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("It is anonymos structure way");
				System.out.println("Current Thread: "+Thread.currentThread().getName());//Current Thread: Thread3
			}
		});
		thread3.setName("Thread3"); //thread`e isim verme
		thread3.start();
		
		
		Thread thread4 = new Thread(()->{
			System.out.println("It is lamda way");
		});
		thread4.start();
		
		
		System.out.println("Main method is ended"); // hep ayni yerde vermeyebilir, threadlere basla deyip devam eder
												//bitmesini beklemez

	}

}

//1. way to create a thread : extends Thread
class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("It is custom thread is running");
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("It is custom runnable class that implements Runnable interface");
		
	}
	
}
