package multiThreading;

/*
============================================= VOLATILE ===============================================================
Volatile (uçucu, geçici, kalıcı olmayan) keyword'u, Bir degiskenin farklı threadler tarafından kullanılırken degerinin
degismesini saglamak icin kullanılmaktadir. Aynı zamanda bir class'ı thread-safe(thread güvenliği ile çalışma) yapmak
icin de kullanılır.  Yani eş zamanlı olarak volatile veriable threadler tarafından erişip güncelleyebilir ve Volatile
 keywordu sadece degiskenler ile (primitif veya non-primitif)  kullanılabilir. Obj, method ve Class'lara konulmaz

Volatile keywordu kullanılan bir veriable'ın degeri cache bellege saklanmaz. Her defasında ilgili class'ın process
bellegi
(MAIN MEMORY) den okunur. Dolayısıyla farklı thread'ler degiskeni guncellese de her defasında en guncel deger
okunmus olur.
Bu özellikleri sayesinde Synchronization yönteminin daha iyi bir alternatifi olarak düşünülebilir.
*/
public class MT05Volatile {
    //task messi ronaldo cekismesini gol atanin  volatile degiskenine etki etmesini saglayin ve app i bitirin





}