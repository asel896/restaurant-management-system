public class Kullanici {
    private String adSoyad;
    private Rol rol;
    private String sifre;
    private int kullaniciId;
    public enum Rol {
        ADMIN,
        GARSON
    }

    public Kullanici(String adSoyad, Rol rol, String sifre, int kullaniciId) {
        this.adSoyad = adSoyad;
        this.rol = rol;
        this.sifre = sifre;
        this.kullaniciId = kullaniciId;
    }

    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public int getKullaniciId() {
        return kullaniciId;
    }
    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

}

