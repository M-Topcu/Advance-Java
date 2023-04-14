package com.tpe.threads;

import java.util.concurrent.Semaphore;

public class Semaphore1 {
	/*
	 * semaphore ayni anda kac threadin calisabilecegini ayarliyor denebilir.
	 * limiti 4 belirledik, acquiring yapinca sayi 3`e dustu sonra 2 1 0.
	 * release yapinca da tekrar artti
	 * methodu 4 kisi kullabilmis oldu sadece
	 */

	public static void main(String[] args) throws InterruptedException {
		
		Semaphore semaphore = new Semaphore(4);
		Thread.sleep(3000);
		
		System.out.println("Total available car lot in the park " + semaphore.availablePermits());
		
		Car carA = new Car("A", semaphore);
		carA.start();
		
		Car carB = new Car("B", semaphore);
		carB.start();
		
		Car carC = new Car("C", semaphore);
		carC.start();
		
		Car carD = new Car("D", semaphore);
		carD.start();
		
		Car carE = new Car("E", semaphore);
		carE.start();
		
		Car carF = new Car("F", semaphore);
		carF.start();
	}

}

class Car extends Thread{
	private String name;
	
	Semaphore semaphore;
	
	public Car(String name, Semaphore semaphore) {
		this.name=name;
		this.semaphore=semaphore;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(name + " : acquiring the lot ....");
			semaphore.acquire();
			
			System.out.println(name + " : got the lot!");
			
			for (int i = 1; i <=4; i++) {
				System.out.println(name + " waiting in the car park" + i + " hour");
				Thread.sleep(3000);
			}
			System.out.println(name + ".... releasing the lot");
			semaphore.release();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
