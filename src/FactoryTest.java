public class FactoryTest {
    public static void main(String[] args) {

        Login login = new Login();

        Kullanici Admin = KullaniciFactory.createKullanici(
                Kullanici.Rol.ADMIN,
                "Ali Yilmaz",
                "1234",
                1
        );

        Kullanici Garson = KullaniciFactory.createKullanici(
                Kullanici.Rol.GARSON,
                "Veli Dogan",
                "5678",
                2
        );

        if (Admin.getRol() == Kullanici.Rol.ADMIN) {
            System.out.println("Admin factory basarili");
        }

        if (Garson.getRol() == Kullanici.Rol.GARSON) {
            System.out.println("Garson factory basarili");
        }

    }
}
