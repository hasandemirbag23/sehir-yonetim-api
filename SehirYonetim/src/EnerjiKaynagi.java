public class EnerjiKaynagi extends Varlik {
    private float kapasite;

    public EnerjiKaynagi(String id, String tip, float kapasite) {
        super(id, tip, "Kapasite: " + kapasite);
        this.kapasite = kapasite;
    }

    public float getKapasite() {
        return kapasite;
    }

    public void setKapasite(float kapasite) {
        this.kapasite = kapasite;
    }

    @Override
    public String toString() {
        return "Enerji Kaynağı ID: " + getId() + ", Tip: " + getTip() + ", Kapasite: " + kapasite;
    }
}
