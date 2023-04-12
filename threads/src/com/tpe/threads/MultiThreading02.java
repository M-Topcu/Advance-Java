package com.tpe.threads;

public class MultiThreading02 {
	
	public static int counter=0;

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Counter.count();
				System.out.println("Thread1 completed...");
				}
			});
		thread1.start();
		
		// thread1.join(); // ise yarar ama efektif degil
		
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Counter.count();
				System.out.println("Thread1 completed...");
				}
			});
		thread2.start();
		
		//calistirinca her defasinda baska degerler cikti

		

	}

}

class Counter{
	public synchronized static void count() { // syncronized sirayla girmesini sagliyor threadlerin
		for (int i = 1; i <=1000; i++) {
			MultiThreading02.counter++;
			
		}
		System.out.println("Counter: " + MultiThreading02.counter);
	}
}
