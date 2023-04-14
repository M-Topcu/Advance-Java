package enums.Ex01;

public enum Aylar {
    OCAK(30),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(30),
    HAZIRAN(30),
    TEMMUZ(30),
    AGUSTOS(30),
    EYLUL(30),
    EKIM(30),
    KASIM(30),
    ARALIK(31);


    int days;

    Aylar(int days) {
        this.days = days;
    }
    void getGunSayisi(){
        System.out.println("days = " + days);
    }


}
