import java.util.ArrayList;

public class Login {
    private ArrayList<Kullanici> kullanicilar = new ArrayList<>();

    // kullanici ekledim
    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.add(kullanici);
    }

    // login
    public Kullanici login(int id, String sifre) {

        for (int i = 0; i < kullanicilar.size(); i++) {
            Kullanici k = kullanicilar.get(i);

            if (k.getKullaniciId() == id && k.getSifre().equals(sifre)) {

                System.out.println("Giriş başarılı: " + k.getAdSoyad());

                // rol bazli
                if (k.getRol() == Kullanici.Rol.ADMIN) {
                    System.out.println("ADMIN PANELİNE YÖNLENDİRİLDİ");
                }
                else if (k.getRol() == Kullanici.Rol.GARSON) {
                    System.out.println("GARSON PANELİNE YÖNLENDİRİLDİ");
                }

                return k;
            }
        }

        System.out.println("Hatali giris. Yanlis ID veya sifre!");
        return null;
    }

}
