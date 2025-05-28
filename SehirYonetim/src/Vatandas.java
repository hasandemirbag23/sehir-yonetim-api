class Vatandas {
    private String isim;
    private int tcn;

    public Vatandas(String isim, int tcn) {
        this.isim = isim;
        this.tcn = tcn;
    }

    public String trafikKontrol() {
        return "Trafik durumu kontrol edildi.";
    }

    public String enerjiDurumuKontrol() {
        return "Enerji durumu kontrol edildi.";
    }

    public String suDurumuKontrol() {
        return "Su durumu kontrol edildi.";
    }
}