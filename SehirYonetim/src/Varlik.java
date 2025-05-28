public abstract class Varlik {
    private String id;
    private String tip;  // Örneğin "Araç", "Bina", "Enerji Kaynağı" vb.
    private String detay;  // Varlığa ait ek açıklama veya detay bilgisi

    // Constructor
    public Varlik(String id, String tip, String detay) {
        this.id = id;
        this.tip = tip;
        this.detay = detay;
    }

    // Getter ve Setter metodları
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    // Abstract method, her alt sınıfın kendi toString() metodunu tanımlaması gerek
    public abstract String toString();
}
