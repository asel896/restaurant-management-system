public class KullaniciFactory {
    public static Kullanici createKullanici(
            Kullanici.Rol rol,
            String adSoyad,
            String sifre,
            int id
    ) {

        if (rol == Kullanici.Rol.ADMIN) {
            return new Admin(adSoyad, rol, sifre, id);
        } else if (rol == Kullanici.Rol.GARSON) {
            return new Garson(adSoyad, rol, sifre, id, 80);
        }
        return null;
    }
}