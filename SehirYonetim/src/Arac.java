public class Arac extends Varlik {
    int kapasite;
    private String sarjDurumu;
    private String konum;  // Araç konumu (örneğin: "Bölge A")
// Araç konumu (örneğin: "Bölge A")

    // Constructor
    public Arac(String id, String tip, int kapasite, String sarjDurumu, String konum) {
        super(id, tip, "Kapasite: " + kapasite + ", Şarj Durumu: " + sarjDurumu + ", Konum: " + konum);
        this.kapasite = kapasite;
        this.sarjDurumu = sarjDurumu;
        this.konum = konum;
    }
    

    // Getter ve Setter metodları
    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public String getSarjDurumu() {
        return sarjDurumu;
    }

    public void setSarjDurumu(String sarjDurumu) {
        this.sarjDurumu = sarjDurumu;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    @Override
    public String toString() {
        return "Araç ID: " + getId() + ", Tip: " + getTip() + ", Kapasite: " + kapasite + ", Şarj Durumu: " + sarjDurumu + ", Konum: " + konum;
    }

    void setAracTipi(String yeniAracTipi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
