public class TrafikYonetimi {
    private int aracSayisi;
    private String trafikDurumu;

    public TrafikYonetimi(int aracSayisi) {
        this.aracSayisi = aracSayisi;
        updateTrafikDurumu();
    }

    public void setAracSayisi(int aracSayisi) {
        this.aracSayisi = aracSayisi;
        updateTrafikDurumu();
    }

    private void updateTrafikDurumu() {
        if (aracSayisi > 20) {
            this.trafikDurumu = "Yoğun Trafik";
        } else {
            this.trafikDurumu = "Normal Trafik";
        }
    }

    public String getTrafikDurumu() {
        return trafikDurumu;
    }
}
