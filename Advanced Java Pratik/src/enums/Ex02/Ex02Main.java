package enums.Ex02;

public class Ex02Main {

    public static void main(String[] args) {
        //1 user classdan user create edin
        //2 user a Role enum dan role atayin
        //3 user a Status enum dan durum atayin
        //yetki konrolu yapip data silip silemeyecegini kontrol edin
        // not data yi yalniz admin silebilir

        User user1=new User();
        user1.yetki = Role.ADMIN;
        user1.durum = Status.ACTIVE;





        User user2=new User();




    }
}
