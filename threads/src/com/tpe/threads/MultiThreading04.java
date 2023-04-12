package com.tpe.threads;

public class MultiThreading04 {

	public static void main(String[] args) {
		
		Brackets2 brackets2 = new Brackets2();
		
		long startTime= System.currentTimeMillis(); //1970 beri sayilan, evrensel zaman esitleme methodu
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <=7; i++) {
					brackets2.generateBrackets();
				}
				
			}
			
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <=7; i++) {
					brackets2.generateBrackets();
				}
				
			}
			
		});
		thread2.start();

	}

}

class Brackets2{
	public synchronized void generateBrackets() {
		for (int i = 1; i <=10; i++) {
			if(i<=5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println("");
	}
}
