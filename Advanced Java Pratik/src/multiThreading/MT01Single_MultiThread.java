package multiThreading;

public class MT01Single_MultiThread {
    /*

      ============================================ THREAD, PROCESS=========================================================
    Thread : Kelime manası iplik olmasına karşın IT alanında iş parçacığı olarak adlandırılır.
    Thread, Process olarak adlandırılan ve her bir çalışan programın alt iş parçaçığı olarak düşünülebilir.
    Single-Thread: Tek iş parcacığı vardır. Ve tüm işler sıra ile yapılır.JVM default olarak Single-Thread create eder.
    Multi-Thread: Bir den fazla iş parçacığı vardır ve bu işler aynı anda yapılabilir (farklı işlemciler yardımıyla)

    Javada 2 yöntem ile Thread oluşturmak mümkündür.
    ----------------------------------------------
    1- Thread classından bir class extends (türeterek) edilerek
    2- Runnable Interface'inden implements edilerek.

    Thread class'ının yaygın kullanılan metotlari:
    -----------------------------------------------
  *  public void run(): Bir threat'in calistiracagi islemleri tanımlamak amacıyla kullanlır.
                        Bir thread create edildiğinde içinde ne çalışacagını run() method override edilerek olusturulur.
                        Bir thread'in yapacagı action run() method içinde tanımlanır.

  *  public void start(): Bir thread'in baslatilmasini saglar.JVM, thread'in run() methodunu calistirir.

  *  public void sleep(long miliseconds): Bir thread'in belirtilen sure (ms) boyunca bekletilmesini saglar.
  *  public void join(): Bir thread olmesini (bitmesi) beklemek icin kullanilir.
                        Thread'in olmesi beklendikten sonra sıradaki komutlar run edilir.Sıralı run işlemlerinde gayet önemlidir.
  *  public int getPriority(): Aynı anda birden cok çalışan Thread'ler için bir thread'in önceligini dondurur.
    public int setPriority(int priority): Bir thread icin oncelik ayarlamaya yarar.
    public String getName(): Bir thread'in adini dondurur.
    public void setName(String name): Bir thread'e isim vermeye yarar.
    public Thread currentThread(): Su an calisan thread'in referansını dondurur.
    public int getId(): Bir thread'in id numarasını dondurur.
    public Thread.State getState(): Bir thread'in state (durum)'ini dondurur.
    public boolean isAlive(): Bir thread'in canlı (alive) olup olmadığını soyler.
    public void yield(): Aktif olan bir thread'in gecici olarak durdurulmasini ve baska thread'lerin calistirilmasini saglar.
    public boolean isDaemon(): Bir thread'in Deamon(şeytan:arka planda çalışan garbage collector gibi JVM'in kapanmasını engellemeyen önceliği düşük thread'ler)
                               threat olup olmadıgını test eder. Gerekmedikçe kullanılmamalı. Arka planda çalışmayacak thread'ler için kulanılırsa JVM kapatabilir
    public void setDaemon(boolean b): Bir thread'i deoman thread olarak işaretler.
  *  public void interrupt(): Thread kesintiye ugratır.mevcut App çalışırken flash bellek takma gibi eş zamalılıgı kesmek için kullanılır.
                              Usp klavye port bu thread'i kullanır
    public boolean isInterrupted(): Bir thread'in kesilip kesilmediğni test eder.

     */


    // task single ve multi thread farkini gostriniz
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" *** single thread ****");
        long singleBasla=System.currentTimeMillis();

        SingleThreadSayac sT1=new SingleThreadSayac(1);
        sT1.sThreadSayac();

        SingleThreadSayac sT2=new SingleThreadSayac(2);
        sT2.sThreadSayac();
        long singleBitis=System.currentTimeMillis();
        System.out.println("single thread run edilme suresi= " +( singleBitis - singleBasla));

        System.out.println(" *** multi thread ****");
        long multiBasla=System.currentTimeMillis();

        MultiThreadSayac mT1=new MultiThreadSayac(3);
        mT1.start();//run i tetikleyecek
       // mT1.join();

        MultiThreadSayac mT2=new MultiThreadSayac(4);
        mT2.start();
        //mT2.join();

        long multiBitis=System.currentTimeMillis();
        System.out.println("multi threads run edilme suresi = " + (multiBitis - multiBasla));


    }




}
class SingleThreadSayac{//multipl class
    private int threadNo;

    public SingleThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }

    public void sThreadSayac(){
        for (int i = 0; i <=10 ; i++) {//10 tane islem var
            System.out.println("i "+i+ " icin calisan thread no: " +threadNo);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


class MultiThreadSayac extends Thread {//multipl class
    private int threadNo;

    public MultiThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }

    public void mThreadSayac(){
        for (int i = 0; i <=10 ; i++) {//10 tane islem var process
            System.out.println("i "+i+ " icin calisan multi thread no: " +threadNo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void run(){//hizmetciye is tanimi yapildi
        mThreadSayac();
    }//hizmetci



}