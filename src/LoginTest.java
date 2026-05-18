public class LoginTest {
    public static void main(String[] args) {

        Login login = new Login();

        Kullanici admin = new Admin("Ali Yilmaz", Kullanici.Rol.ADMIN, "1234", 1);
        Kullanici garson = new Garson("Veli Dogan", Kullanici.Rol.GARSON, "5678", 2,85);

        login.kullaniciEkle(admin);
        login.kullaniciEkle(garson);



        login.login(1, "1234");
        System.out.println("-----------");


        login.login(2, "5678");
        System.out.println("-----------");


        login.login(2, "0000");
        System.out.println("-----------");


        login.login(99, "1234");
        System.out.println("-----------");
    }
}