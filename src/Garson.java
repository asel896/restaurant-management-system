public class Garson extends Kullanici{
    protected int performansPuani;
    public Garson(String adSoyad, Rol rol, String sifre, int kullaniciId,int performansPuani){
        super(adSoyad, rol, sifre, kullaniciId);
        this.performansPuani=performansPuani;
    }
    public int getPerformansPuani(){
        return performansPuani;
    }
    public void setPerformansPuani(int performansPuani){
        this.performansPuani = performansPuani;
    }
}