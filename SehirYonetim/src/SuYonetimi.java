public class SuYonetimi {
    private float suSeviyesi;

    public SuYonetimi(float suSeviyesi) {
        this.suSeviyesi = suSeviyesi;
    }

    public void updateSuSeviyesi(float suSeviyesi) {
        this.suSeviyesi = suSeviyesi;
    }

    public String getSuDurumu() {
        if (suSeviyesi < 10) {
            return "Uyarı: Su rezervi düşük!";
        } else {
            return "Su rezervi yeterli.";
        }
    }
}
