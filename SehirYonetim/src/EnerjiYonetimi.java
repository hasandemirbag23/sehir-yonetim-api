import java.util.List;
import java.util.ArrayList;

public class EnerjiYonetimi {
    private ArrayList<EnerjiKaynagi> enerjiKaynaklari;

    public EnerjiYonetimi() {
        enerjiKaynaklari = new ArrayList<>();
    }

    // Enerji kaynağını listeye ekleme
    public void enerjiKaynağıEkle(EnerjiKaynagi enerjiKaynağı) {
        enerjiKaynaklari.add(enerjiKaynağı);
    }

    // Toplam kapasiteyi hesaplama
    public float toplamKapasite() {
        float toplamKapasite = 0;
        for (EnerjiKaynagi enerjiKaynağı : enerjiKaynaklari) {
            toplamKapasite += enerjiKaynağı.getKapasite(); // Kapasiteleri topluyoruz
        }
        return toplamKapasite;
    }

    // Harcanan enerji
    public float getHarcananEnerji() {
        return 2000; // Şu an için örnek bir değer
    }

    // Alınan enerji
    public float getAlinanEnerji() {
        return 2350; // Şu an için örnek bir değer
    }
}


