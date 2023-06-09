package generics;
//OCA trick = ayni dosya icinde birden fazla create edilen non-inner class lari JVM compile ederken
// sadece main class public olarak tanimlar. diger class lar dan herhangi biri de public olursa CTE veriri

public class G07genericInterface {//main class
        //1 math islem yapan mehodu olan generic bir interface create diniz
        //2 silme yapan bir class create edip bu classtan interface i implement edin
        //3 main methoddan obj ler creqate dip call yapin

        public static void main(String[] args) {
            UsAlanClass<Float> floatUs=new UsAlanClass<>();
            System.out.println("floatUs.usAl(5f,2f) = " + floatUs.usAl(5f, 2f));

            UsAlanClass<Double> doubleUs=new UsAlanClass<>();
            System.out.println("doubleUs.usAl(5.2,2.3) = " + doubleUs.usAl(5.2, 2.3));

            UsAlanClass<Integer> intUs=new UsAlanClass<>();
            System.out.println("intUs.usAl(2,6) = " + intUs.usAl(2, 6));


        }
}
interface MathIslem <T extends Number>{//generic int. faceden data type Number olarak parametrenin bounded i creat edildi
    double usAl(T t, T u);//parametreli abstract method cunku body yok
}
class UsAlanClass <T extends Number> implements MathIslem <T>{

    @Override
    public double usAl(T t, T u) {//pow methodu pm olarak double data tripinde alir
                                    // bundan dolayi parametreleri double`a dponusturduk

        return Math.pow(t.doubleValue(), u.doubleValue());
    }
}

