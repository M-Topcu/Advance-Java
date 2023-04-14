package generics;

public class G05genericClasses {//non generic main class
    public static void main(String[] args) {
       //1 veri sakla adinda generic pojo class create ediniz
        //2 getter setter ve pm li const create
        //3 dataprint adinda non-generic class create ediniz
        //4 yazdir adinda pm li generic methoda create ediniz
        //main method dan farkli tiplerde obj create ederek bunlari yazdrin

        VeriSakla<String> obj1 = new VeriSakla("obje1");
        DataPrint dp1 = new DataPrint();
        dp1.yazdir(obj1.getT());

        VeriSakla<Double> obj2 = new VeriSakla(86154.888);
        DataPrint dp2 = new DataPrint();
        dp1.yazdir(obj2.getT());

    }
}
class VeriSakla <T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public VeriSakla(T t) {
        this.t = t;
    }
}
class DataPrint{
       public <T> void yazdir(T t) {
           System.out.println("Veri: " + t);
       }
}




