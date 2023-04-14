package enums.Ex01;

public class Ex01Main {
    public static void main(String[] args) {
        //1 Aylar enum create edin
        //2 enum class da constructor create edin
        //3  constructor kullanarak ay ve gun sayisini main methodda yazdirin

        Aylar ay=Aylar.AGUSTOS;
        ay.getGunSayisi();
        System.out.println("ay = " + ay);


    }
}
