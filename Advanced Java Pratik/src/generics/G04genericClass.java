package generics;

public class G04genericClass <T> {//T type parametrik class declaration yapalim <T> yaptin mi yeterli
        //1 bu class i generic yapiniz
        //2 bir field tanimla ve getter setter const olustur
        //3 main methoddan farkli tiplerde obj create edip yazdir

    private int sayi;

    public static void main(String[] args) {

        G04genericClass<Integer> obj1 = new G04genericClass(8);

        System.out.println("obj1.sayi = " + obj1.sayi);
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public <T> G04genericClass(int sayi) {
    this.sayi = sayi;
        System.out.println("obje olusturuldu");
    }
}
