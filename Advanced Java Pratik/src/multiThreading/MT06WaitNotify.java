package multiThreading;

/*
============================ WAIT, NOTIFY ==========================
   object.wait()-->(obj ile çalışır Multi-Thread ile kullanılır) methodu bir thread'i suresiz olarak askıya alir(suspent).
    Diğer bir ifade ile bu thread'in kilitlemiş (locked) olduğu bir kaynağı salıvermesini ve askıya geçmesini sağlar.
    Thread bu durumdan bir başka thread Onu bilgilendirirse (notify) çıkabilir.

   object.notify()-->(obj ile çalışır Multi-Thread ile kullanılır) metodu ise aynı obj üzerinde wait (askıya alınan)
    bir thread'in uyanmasini saglar.  notify : Bildirmek, haber vermek, ihbar etmek
   Object.notifyAll() metodu bir nesne üzerinde askıya alınan tum thread'lerin uyandirilmasini saglar.

   Bu methodlar, thread'ler arasi iletişim (inter-Thread communication) metodu olarak kullanılır.
   Aynı  class'ta birden çok method'lar wait() ve notify() yapılabilir.
 */
public class MT06WaitNotify {

        //task oara yatir ve para cek threadleri yapip bunlari islem sirasina koyup akisi saglayiniz
        //yani para yatirmadan para cekemsin vs


}



