package multiThreading;

public class MT04ClassLevelSynchronized {
    /*
      Thread'ler farklı obj'ler kullanılırsa durum nasıl değişir?
    Dolayısıyla method seviyesi synchronization işe yaramayacaktır.
    Çünkü her iki thread, farklı obj'lerin golAt() methodunu calistirmaktadir.
    Burada çözüm için class seviyesinde blocklama yapmaktır.
    Çünkü her iki obje aynı class'dan create edilmektedir.

    */

        //task messi ronaldo methodun tum block larina erisimini block layiniz
}