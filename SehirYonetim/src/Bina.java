public class Bina extends Varlik {
    private int katSayisi;
    private float enerjiVerimliligi;

    // Constructor
    public Bina(String id, String tip, int katSayisi, float enerjiVerimliligi) {
        super(id, tip, "Kat Sayısı: " + katSayisi + ", Enerji Verimliliği: " + enerjiVerimliligi);
        this.katSayisi = katSayisi;
        this.enerjiVerimliligi = enerjiVerimliligi;
    }

    // Getter ve Setter metodları
    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    public float getEnerjiVerimliligi() {
        return enerjiVerimliligi;
    }

    public void setEnerjiVerimliligi(float enerjiVerimliligi) {
        this.enerjiVerimliligi = enerjiVerimliligi;
    }

    @Override
    public String toString() {
        return "Bina ID: " + getId() + ", Tip: " + getTip() + ", Kat Sayısı: " + katSayisi + ", Enerji Verimliliği: " + enerjiVerimliligi;
    }

    void setBinaTipi(String yeniBinaTipi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
