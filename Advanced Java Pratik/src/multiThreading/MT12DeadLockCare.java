package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MT12DeadLockCare {

    //task deadlockcare i delicesine calisiniz sartlar ile bakip ona gore thred lerin kaynaga
    // erismesine izin verin yani kizim musaitse baba goturebilir degilse annede demektir

    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();


        Thread anneTh = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean aciktiKizim = false;//bayrak mantigi
                boolean aciktiOglum = false;
                boolean doyduKizim = false;
                boolean doyduOglum = false;

                while (true) {
                   // System.out.println("lock1 = " + lock1);
                    try {
                        if (!aciktiKizim) {
                            aciktiKizim = lock1.tryLock();
                            if (aciktiKizim) {
                                System.out.println("anne kizini yemege cikardi");
                            }
                        }
                        if (!aciktiOglum) {
                            aciktiOglum = lock2.tryLock();
                            if (aciktiOglum) {
                                System.out.println("anne oglunu yemege gotrudu");
                            }

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } finally {
                        if (aciktiKizim && !doyduKizim) {
                            lock1.unlock();
                            doyduKizim = true;
                            System.out.println("anne kziini yemekten eve getirdi");
                        }
                        if (aciktiOglum && !doyduOglum) {
                            lock2.unlock();
                            doyduOglum = true;
                            System.out.println("anne oglunu yemekten eve getirdi");
                        }

                    }
                    if (aciktiOglum && aciktiKizim) {
                        break;
                    }
                }
            }
        });

        Thread babaTh = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean aciktiKizim = false;
                boolean aciktiOglum = false;
                boolean doyduKizim = false;
                boolean doyduOglum = false;

                while (true) {
                    //System.out.println("lock1 = " + lock1);
                    try {
                        if (!aciktiKizim) {
                            aciktiKizim = lock1.tryLock();
                            if (aciktiKizim) {
                                System.out.println("baba kizini yemege cikardi");
                            }
                        }
                        if (!aciktiOglum) {
                            aciktiOglum = lock2.tryLock();
                            if (aciktiOglum) {
                                System.out.println("baba oglunu yemege gotrudu");
                            }

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } finally {
                        if (aciktiKizim && !doyduKizim) {
                            System.out.println("baba kziini yemekten eve getirdi");
                            lock1.unlock();
                            doyduKizim = true;

                        }
                        if (aciktiOglum && !doyduOglum) {
                            System.out.println("baba oglunu yemekten eve getirdi");
                            lock2.unlock();
                            doyduOglum = true;


                        }

                    }
                    if (aciktiOglum && aciktiKizim) {
                        break;
                    }
                }
            }
        });


        anneTh.start();
        babaTh.start();


    }


}