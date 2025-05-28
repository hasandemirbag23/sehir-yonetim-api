import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminPanel extends JFrame {
    private ArrayList<Varlik> varliklar = new ArrayList<>();  // Varlıkları burada tutacağız
    private DefaultListModel<String> aracListModel = new DefaultListModel<>();
    private DefaultListModel<String> binaListModel = new DefaultListModel<>();
    private DefaultListModel<String> enerjiKaynağıListModel = new DefaultListModel<>();
    private DefaultListModel<String> sorunListModel = new DefaultListModel<>();

    // Şehir hizmetlerine dair bilgiler
    private int trafikYoğunluğu = 70; // Varsayılan trafik yoğunluğu
    private float enerjiÜretimi = 100; // Enerji üretimi
    private float enerjiTüketimi = 80; // Enerji tüketimi
    private float suRezervi = 50; // Su rezervi

    public AdminPanel() {
        setTitle("ŞEHİR YÖNETİMİ ADMİN PANELİ");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        
        

        // Araçlar ekleniyor
varliklar.add(new Arac("1", "Otobüs", 50, "Yüksek", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 1 | Tip: Otobüs | Kapasite: 50 | Şarj Durumu: Yüksek | Konum: Çayda Çıra");

varliklar.add(new Arac("2", "Otomobil", 4, "Orta", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 2 | Tip: Otomobil | Kapasite: 4 | Şarj Durumu: Orta | Konum: Çayda Çıra");

varliklar.add(new Arac("3", "Motosiklet", 2, "Düşük", "Üniversite"));
aracListModel.addElement("Araç ID: 3 | Tip: Motosiklet | Kapasite: 2 | Şarj Durumu: Düşük | Konum: Üniversite");

varliklar.add(new Arac("4", "Elektrikli Otobüs", 50, "Düşük", "Üniversite"));
aracListModel.addElement("Araç ID: 4 | Tip: Elektrikli Otobüs | Kapasite: 50 | Şarj Durumu: Düşük | Konum: Üniversite");

varliklar.add(new Arac("5", "Elektrikli Otomobil", 4, "Yüksek", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 5 | Tip: Elektrikli Otomobil | Kapasite: 4 | Şarj Durumu: Yüksek | Konum: Çayda Çıra");

varliklar.add(new Arac("6", "Otomobil", 4, "Orta", "Üniversite"));
aracListModel.addElement("Araç ID: 6 | Tip: Otomobil | Kapasite: 4 | Şarj Durumu: Orta | Konum: Üniversite");

varliklar.add(new Arac("7", "Otobüs", 50, "Yüksek", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 7 | Tip: Otobüs | Kapasite: 50 | Şarj Durumu: Yüksek | Konum: Çayda Çıra");

varliklar.add(new Arac("8", "Motosiklet", 2, "Orta", "Üniversite"));
aracListModel.addElement("Araç ID: 8 | Tip: Motosiklet | Kapasite: 2 | Şarj Durumu: Orta | Konum: Üniversite");

varliklar.add(new Arac("9", "Elektrikli Motosiklet", 2, "Düşük", "Üniversite"));
aracListModel.addElement("Araç ID: 9 | Tip: Elektrikli Motosiklet | Kapasite: 2 | Şarj Durumu: Düşük | Konum: Üniversite");

varliklar.add(new Arac("10", "Otobüs", 50, "Orta", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 10 | Tip: Otobüs | Kapasite: 50 | Şarj Durumu: Orta | Konum: Çayda Çıra");

varliklar.add(new Arac("11", "Elektrikli Otobüs", 50, "Yüksek", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 11 | Tip: Elektrikli Otobüs | Kapasite: 50 | Şarj Durumu: Yüksek | Konum: Çayda Çıra");

varliklar.add(new Arac("12", "Otomobil", 4, "Düşük", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 12 | Tip: Otomobil | Kapasite: 4 | Şarj Durumu: Düşük | Konum: Çayda Çıra");

varliklar.add(new Arac("13", "Elektrikli Otomobil", 4, "Orta", "Üniversite"));
aracListModel.addElement("Araç ID: 13 | Tip: Elektrikli Otomobil | Kapasite: 4 | Şarj Durumu: Orta | Konum: Üniversite");

varliklar.add(new Arac("14", "Motosiklet", 2, "Yüksek", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 14 | Tip: Motosiklet | Kapasite: 2 | Şarj Durumu: Yüksek | Konum: Çayda Çıra");

varliklar.add(new Arac("15", "Otobüs", 50, "Yüksek", "Üniversite"));
aracListModel.addElement("Araç ID: 15 | Tip: Otobüs | Kapasite: 50 | Şarj Durumu: Yüksek | Konum: Üniversite");

varliklar.add(new Arac("16", "Elektrikli Otobüs", 50, "Orta", "Üniversite"));
aracListModel.addElement("Araç ID: 16 | Tip: Elektrikli Otobüs | Kapasite: 50 | Şarj Durumu: Orta | Konum: Üniversite");

varliklar.add(new Arac("17", "Elektrikli Motosiklet", 2, "Yüksek", "Üniversite"));
aracListModel.addElement("Araç ID: 17 | Tip: Elektrikli Motosiklet | Kapasite: 2 | Şarj Durumu: Yüksek | Konum: Üniversite");

varliklar.add(new Arac("18", "Otomobil", 4, "Yüksek", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 18 | Tip: Otomobil | Kapasite: 4 | Şarj Durumu: Yüksek | Konum: Çayda Çıra");

varliklar.add(new Arac("19", "Otobüs", 50, "Düşük", "Üniversite"));
aracListModel.addElement("Araç ID: 19 | Tip: Otobüs | Kapasite: 50 | Şarj Durumu: Düşük | Konum: Üniversite");

varliklar.add(new Arac("20", "Elektrikli Otobüs", 50, "Yüksek", "Üniversite"));
aracListModel.addElement("Araç ID: 20 | Tip: Elektrikli Otobüs | Kapasite: 50 | Şarj Durumu: Yüksek | Konum: Üniversite");

varliklar.add(new Arac("21", "Motosiklet", 2, "Orta", "Çayda Çıra"));
aracListModel.addElement("Araç ID: 21 | Tip: Motosiklet | Kapasite: 2 | Şarj Durumu: Orta | Konum: Çayda Çıra");

varliklar.add(new Arac("22", "Elektrikli Otomobil", 4, "Düşük", "Üniversite"));
aracListModel.addElement("Araç ID: 22 | Tip: Elektrikli Otomobil | Kapasite: 4 | Şarj Durumu: Düşük | Konum: Üniversite");

varliklar.add(new Arac("23", "Otobüs", 50, "Yüksek", "Üniversite"));
aracListModel.addElement("Araç ID: 23 | Tip: Otobüs | Kapasite: 50 | Şarj Durumu: Yüksek | Konum: Üniversite");

varliklar.add(new Arac("24", "Otomobil", 4, "Orta", "Üniversite"));
aracListModel.addElement("Araç ID: 24 | Tip: Otomobil | Kapasite: 4 | Şarj Durumu: Orta | Konum: Üniversite");

varliklar.add(new Arac("25", "Elektrikli Motosiklet", 2, "Düşük", "Üniversite"));
aracListModel.addElement("Araç ID: 25 | Tip: Elektrikli Motosiklet | Kapasite: 2 | Şarj Durumu: Düşük | Konum: Üniversite");


// Enerji kaynakları ekleniyor
varliklar.add(new EnerjiKaynagi("1", "Güneş Paneli", 100.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 1 | Tip: Güneş Paneli | Kapasite: 100.0 kW");

varliklar.add(new EnerjiKaynagi("2", "Rüzgar Türbini", 80.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 2 | Tip: Rüzgar Türbini | Kapasite: 80.0 kW");

varliklar.add(new EnerjiKaynagi("3", "Nükleer Santral", 500.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 3 | Tip: Nükleer Santral | Kapasite: 500.0 kW");

varliklar.add(new EnerjiKaynagi("4", "Fosil Yakıt", 200.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 4 | Tip: Fosil Yakıt | Kapasite: 200.0 kW");

varliklar.add(new EnerjiKaynagi("5", "Güneş Paneli", 150.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 5 | Tip: Güneş Paneli | Kapasite: 150.0 kW");

varliklar.add(new EnerjiKaynagi("6", "Rüzgar Türbini", 120.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 6 | Tip: Rüzgar Türbini | Kapasite: 120.0 kW");

varliklar.add(new EnerjiKaynagi("7", "Nükleer Santral", 550.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 7 | Tip: Nükleer Santral | Kapasite: 550.0 kW");

varliklar.add(new EnerjiKaynagi("8", "Fosil Yakıt", 300.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 8 | Tip: Fosil Yakıt | Kapasite: 300.0 kW");

varliklar.add(new EnerjiKaynagi("9", "Güneş Paneli", 200.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 9 | Tip: Güneş Paneli | Kapasite: 200.0 kW");

varliklar.add(new EnerjiKaynagi("10", "Rüzgar Türbini", 150.0f));
enerjiKaynağıListModel.addElement("Enerji Kaynağı ID: 10 | Tip: Rüzgar Türbini | Kapasite: 150.0 kW");

// Binalar ekleniyor
varliklar.add(new Bina("1", "Akıllı Bina", 20, 90.0f));
binaListModel.addElement("Bina ID: 1 | Tip: Akıllı Bina | Kat Sayısı: 20 | Enerji Verimliliği: 90.0%");

varliklar.add(new Bina("2", "Geleneksel Bina", 8, 75.0f));
binaListModel.addElement("Bina ID: 2 | Tip: Geleneksel Bina | Kat Sayısı: 8 | Enerji Verimliliği: 75.0%");

varliklar.add(new Bina("3", "Akıllı Bina", 15, 85.0f));
binaListModel.addElement("Bina ID: 3 | Tip: Akıllı Bina | Kat Sayısı: 15 | Enerji Verimliliği: 85.0%");

varliklar.add(new Bina("4", "Geleneksel Bina", 10, 70.0f));
binaListModel.addElement("Bina ID: 4 | Tip: Geleneksel Bina | Kat Sayısı: 10 | Enerji Verimliliği: 70.0%");

varliklar.add(new Bina("5", "Akıllı Bina", 25, 95.0f));
binaListModel.addElement("Bina ID: 5 | Tip: Akıllı Bina | Kat Sayısı: 25 | Enerji Verimliliği: 95.0%");

varliklar.add(new Bina("6", "Geleneksel Bina", 6, 80.0f));
binaListModel.addElement("Bina ID: 6 | Tip: Geleneksel Bina | Kat Sayısı: 6 | Enerji Verimliliği: 80.0%");

varliklar.add(new Bina("7", "Akıllı Bina", 18, 88.0f));
binaListModel.addElement("Bina ID: 7 | Tip: Akıllı Bina | Kat Sayısı: 18 | Enerji Verimliliği: 88.0%");

varliklar.add(new Bina("8", "Geleneksel Bina", 12, 65.0f));
binaListModel.addElement("Bina ID: 8 | Tip: Geleneksel Bina | Kat Sayısı: 12 | Enerji Verimliliği: 65.0%");

varliklar.add(new Bina("9", "Akıllı Bina", 30, 90.0f));
binaListModel.addElement("Bina ID: 9 | Tip: Akıllı Bina | Kat Sayısı: 30 | Enerji Verimliliği: 90.0%");

varliklar.add(new Bina("10", "Geleneksel Bina", 5, 60.0f));
binaListModel.addElement("Bina ID: 10 | Tip: Geleneksel Bina | Kat Sayısı: 5 | Enerji Verimliliği: 60.0%");

varliklar.add(new Bina("11", "Akıllı Bina", 28, 92.0f));
binaListModel.addElement("Bina ID: 11 | Tip: Akıllı Bina | Kat Sayısı: 28 | Enerji Verimliliği: 92.0%");

varliklar.add(new Bina("12", "Geleneksel Bina", 14, 78.0f));
binaListModel.addElement("Bina ID: 12 | Tip: Geleneksel Bina | Kat Sayısı: 14 | Enerji Verimliliği: 78.0%");

varliklar.add(new Bina("13", "Akıllı Bina", 22, 86.0f));
binaListModel.addElement("Bina ID: 13 | Tip: Akıllı Bina | Kat Sayısı: 22 | Enerji Verimliliği: 86.0%");

varliklar.add(new Bina("14", "Geleneksel Bina", 11, 72.0f));
binaListModel.addElement("Bina ID: 14 | Tip: Geleneksel Bina | Kat Sayısı: 11 | Enerji Verimliliği: 72.0%");

varliklar.add(new Bina("15", "Akıllı Bina", 35, 93.0f));
binaListModel.addElement("Bina ID: 15 | Tip: Akıllı Bina | Kat Sayısı: 35 | Enerji Verimliliği: 93.0%");


        // Araçlar için listeler
        JPanel aracPanel = new JPanel();
        aracPanel.setLayout(new BoxLayout(aracPanel, BoxLayout.Y_AXIS));
        JList<String> aracListesi = new JList<>(aracListModel);
        aracPanel.add(new JScrollPane(aracListesi));

        // Enerji Kaynakları için listeler
        JPanel enerjiPanel = new JPanel();
        enerjiPanel.setLayout(new BoxLayout(enerjiPanel, BoxLayout.Y_AXIS));
        JList<String> enerjiListesi = new JList<>(enerjiKaynağıListModel);
        enerjiPanel.add(new JScrollPane(enerjiListesi));

        // Binalar için listeler
        JPanel binaPanel = new JPanel();
        binaPanel.setLayout(new BoxLayout(binaPanel, BoxLayout.Y_AXIS));
        JList<String> binaListesi = new JList<>(binaListModel);
        binaPanel.add(new JScrollPane(binaListesi));

        // Varlık yönetimi butonları
        JPanel varlikButtonPanel = new JPanel();
                // Güncelleme paneli
        

        // Şehir Hizmetleri kısmı
        JPanel hizmetPanel = new JPanel();
        hizmetPanel.setLayout(new BoxLayout(hizmetPanel, BoxLayout.Y_AXIS));

        // Trafik durumu raporlama butonu
        JButton trafikButton = new JButton("Trafik Durumunu Raporla");
trafikButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        long aracSayisi = varliklar.stream().filter(v -> v instanceof Arac).count();
        
        String mesaj;
        if (aracSayisi >= 25) {
            mesaj = "Trafik sıkışık: " + aracSayisi + " araç var.";
        } else {
            mesaj = "Trafik akıcı: " + aracSayisi + " araç var.";
        }

        JOptionPane.showMessageDialog(null, mesaj);
    }
});
        EnerjiYonetimi enerjiYonetimi = new EnerjiYonetimi();
        enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("1", "Güneş Paneli", 100.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("2", "Rüzgar Türbini", 80.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("3", "Nükleer Santral", 500.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("4", "Fosil Yakıt", 200.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("5", "Güneş Paneli", 150.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("6", "Rüzgar Türbini", 120.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("7", "Nükleer Santral", 550.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("8", "Fosil Yakıt", 300.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("9", "Güneş Paneli", 200.0f));
enerjiYonetimi.enerjiKaynağıEkle(new EnerjiKaynagi("10", "Rüzgar Türbini", 150.0f));

// Enerji kaynaklarını ekleyelim
JButton enerjiButtonHizmet = new JButton("Enerji Durumunu Raporla");
enerjiButtonHizmet.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // EnerjiYonetimi nesnesini kullanarak toplam kapasiteyi alıyoruz
        float toplamKapasite = enerjiYonetimi.toplamKapasite();
        float harcananEnerji = enerjiYonetimi.getHarcananEnerji();
        float alinanEnerji = enerjiYonetimi.getAlinanEnerji();

        // Durumu kontrol et ve mesajı göster
        if (alinanEnerji < harcananEnerji) {
            JOptionPane.showMessageDialog(null, 
                "Enerji üretimi, tüketimi karşılamıyor.\n" +
                "Alınan Enerji: " + alinanEnerji + " Birim\n" +
                "Harcanan Enerji: " + harcananEnerji + " Birim\n" +
                "Toplam Enerji Kaynağı Kapasitesi: " + toplamKapasite + " kW");
        } else {
            JOptionPane.showMessageDialog(null, 
                "Enerji durumu yeterli.\n" +
                "Alınan Enerji: " + alinanEnerji + " Birim\n" +
                "Harcanan Enerji: " + harcananEnerji + " Birim\n" +
                "Toplam Enerji Kaynağı Kapasitesi: " + toplamKapasite + " kW");
        }
    }
});

        // Su durumu raporlama butonu
        JButton suButton = new JButton("Su Durumunu Raporla");
        suButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (suRezervi < 10) {
                    JOptionPane.showMessageDialog(null, "Su rezervi %10'un altına düştü.");
                } else {
                    JOptionPane.showMessageDialog(null, "Su durumu yeterli. "
                            + "Harcanan günlük su miktarı: 15000 ton "
                            + "Günlük verilen su miktarı 20000 ton");
                    
                }
            }
        });

        hizmetPanel.add(trafikButton);
        hizmetPanel.add(enerjiButtonHizmet);
        hizmetPanel.add(suButton);

        // Varlık ekleme butonları
        JPanel eklemePanel = new JPanel();
        JButton aracEkleButton = new JButton("Araç Ekle");
        aracEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog("Araç ID'sini girin:");
                String aracTipi = JOptionPane.showInputDialog("Araç tipi (Otobüs, otomobil, motosiklet, elektrikli araç):");
                int kapasite = Integer.parseInt(JOptionPane.showInputDialog("Araç kapasitesini girin:"));
                String sarjDurumu = "Elektrikli araç".equalsIgnoreCase(aracTipi) ? JOptionPane.showInputDialog("Şarj durumu (Düşük, Yüksek, Orta):") : "N/A";

                Arac arac = new Arac(id, aracTipi, kapasite, sarjDurumu, "Bölge A");
                varliklar.add(arac);
                aracListModel.addElement(arac.toString());
            }
        });

        JButton binaEkleButton = new JButton("Bina Ekle");
        binaEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog("Bina ID'sini girin:");
                String binaTipi = JOptionPane.showInputDialog("Bina tipi (Akıllı, Geleneksel):");
                int katSayisi = Integer.parseInt(JOptionPane.showInputDialog("Bina kat sayısını girin:"));
                float enerjiVerimliligi = Float.parseFloat(JOptionPane.showInputDialog("Enerji verimliliği oranını girin:"));

                Bina bina = new Bina(id, binaTipi, katSayisi, enerjiVerimliligi);
                varliklar.add(bina);
                binaListModel.addElement(bina.toString());
            }
        });

        JButton enerjiEkleButton = new JButton("Enerji Kaynağı Ekle");
        enerjiEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog("Enerji Kaynağı ID'sini girin:");
                String enerjiTuru = JOptionPane.showInputDialog("Enerji türü (Güneş, Rüzgar, Nükleer, Fosil):");
                float kapasite = Float.parseFloat(JOptionPane.showInputDialog("Enerji kaynağı kapasitesini girin:"));

                EnerjiKaynagi enerjiKaynağı = new EnerjiKaynagi(id, enerjiTuru, kapasite);
                varliklar.add(enerjiKaynağı);
                enerjiKaynağıListModel.addElement(enerjiKaynağı.toString());
            }
        });
        // Araç Sil Button
JButton aracSilButton = new JButton("Araç Sil");
aracSilButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog("Silmek istediğiniz araç ID'sini girin:");
        boolean removed = false;
        for (int i = 0; i < varliklar.size(); i++) {
            if (varliklar.get(i) instanceof Arac && varliklar.get(i).getId().equals(id)) {
                varliklar.remove(i); // Araç varlıklar listesinden silindi

                // Şimdi listModelIndex'i bul ve araç list modelinden kaldır
                int listModelIndex = findIndexInListModel(aracListModel, id);
                if (listModelIndex != -1) {
                    aracListModel.removeElementAt(listModelIndex);
                }

                removed = true;
                JOptionPane.showMessageDialog(null, "Araç silindi: " + id);
                break;
            }
        }
        if (!removed) {
            JOptionPane.showMessageDialog(null, "Araç bulunamadı: " + id);
        }
    }

    private int findIndexInListModel(DefaultListModel<String> listModel, String id) {
        for (int i = 0; i < listModel.size(); i++) {
            // Listede arac id'siyle eşleşen öğe varsa, index'i döndür
            if (listModel.get(i).contains(id)) {
                return i;
            }
        }
        return -1; // Eğer id bulunmazsa -1 döndür
    }
});
eklemePanel.add(aracSilButton);

// Bina Sil Button
JButton binaSilButton = new JButton("Bina Sil");
binaSilButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog("Silmek istediğiniz bina ID'sini girin:");
        boolean removed = false;
        for (int i = 0; i < varliklar.size(); i++) {
            if (varliklar.get(i) instanceof Bina && varliklar.get(i).getId().equals(id)) {
                varliklar.remove(i); // Bina varlıklar listesinden silindi
                int listModelIndex = findIndexInListModel(binaListModel, id);
                if (listModelIndex != -1) {
                    binaListModel.removeElementAt(listModelIndex); // Bina list modelinden kaldır
                }

                removed = true;
                JOptionPane.showMessageDialog(null, "Bina silindi: " + id);
                break;
            }
        }
        if (!removed) {
            JOptionPane.showMessageDialog(null, "Bina bulunamadı: " + id);
        }
    }

    private int findIndexInListModel(DefaultListModel<String> listModel, String id) {
        for (int i = 0; i < listModel.size(); i++) {
            if (listModel.get(i).contains(id)) {
                return i;
            }
        }
        return -1;
    }
});
eklemePanel.add(binaSilButton);

// Enerji Kaynağı Sil Button
JButton enerjiSilButton = new JButton("Enerji Kaynağı Sil");
enerjiSilButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog("Silmek istediğiniz enerji kaynağı ID'sini girin:");
        boolean removed = false;
        for (int i = 0; i < varliklar.size(); i++) {
            if (varliklar.get(i) instanceof EnerjiKaynagi && varliklar.get(i).getId().equals(id)) {
                varliklar.remove(i); // Enerji kaynağı varlıklar listesinden silindi
                int listModelIndex = findIndexInListModel(enerjiKaynağıListModel, id);
                if (listModelIndex != -1) {
                    enerjiKaynağıListModel.removeElementAt(listModelIndex); // Enerji kaynağı list modelinden kaldır
                }

                removed = true;
                JOptionPane.showMessageDialog(null, "Enerji kaynağı silindi: " + id);
                break;
            }
        }
        if (!removed) {
            JOptionPane.showMessageDialog(null, "Enerji kaynağı bulunamadı: " + id);
        }
    }

    private int findIndexInListModel(DefaultListModel<String> listModel, String id) {
        for (int i = 0; i < listModel.size(); i++) {
            if (listModel.get(i).contains(id)) {
                return i;
            }
        }
        return -1;
    }
});
eklemePanel.add(enerjiSilButton);
// Araç Güncelle Button 

JButton aracGuncelleButton = new JButton("Araç Güncelle");
aracGuncelleButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog("Güncellemek istediğiniz araç ID'sini girin:");

        // Eğer ID boşsa, işlem yapılmaz
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Geçerli bir ID girin.");
            return;
        }

        boolean updated = false;
        // Varlıklar listesini dolaşarak doğru aracı bulalım
        for (int i = 0; i < varliklar.size(); i++) {
            if (varliklar.get(i) instanceof Arac && varliklar.get(i).getId().equals(id)) {
                // Yeni bilgiler için kullanıcıdan veri al
                String yeniTip = JOptionPane.showInputDialog("Yeni Tip:");
                String yeniKapasiteStr = JOptionPane.showInputDialog("Yeni Kapasite:");
                String yeniDurum = JOptionPane.showInputDialog("Yeni Şarj Durum:");
                String yeniKonum = JOptionPane.showInputDialog("Yeni Konum:");

                // Arac güncelleniyor
                Arac arac = (Arac) varliklar.get(i);
                arac.setTip(yeniTip);
                arac.setKapasite(Integer.parseInt(yeniKapasiteStr));
                
                arac.setKonum(yeniKonum);

                // Araç list modelindeki öğeyi güncelle
                int listModelIndex = findIndexInListModel(aracListModel, id);
                if (listModelIndex != -1) {
                    aracListModel.set(listModelIndex, "Araç ID: " + id + ", Tip: " + yeniTip + ", Kapasite: " + yeniKapasiteStr + ", Durum: " + yeniDurum + ", Konum: " + yeniKonum);
                }

                updated = true;
                JOptionPane.showMessageDialog(null, "Araç güncellendi: " + id);
                break;
            }
        }
        if (!updated) {
            JOptionPane.showMessageDialog(null, "Araç bulunamadı: " + id);
        }
    }

    // Araç listesinde ID'ye göre index bulma fonksiyonu
    private int findIndexInListModel(DefaultListModel<String> listModel, String id) {
        for (int i = 0; i < listModel.size(); i++) {
            // Listede arac id'siyle eşleşen öğe varsa, index'i döndür
            if (listModel.get(i).contains(id)) {
                return i;
            }
        }
        return -1; // Eğer id bulunmazsa -1 döndür
    }
});

// Ekleme paneline butonu ekleyin
eklemePanel.add(aracGuncelleButton);
        // Bina Güncelle Button
JButton binaGuncelleButton = new JButton("Bina Güncelle");
binaGuncelleButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog("Güncellemek istediğiniz bina ID'sini girin:");

        // Eğer ID boşsa, işlem yapılmaz
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Geçerli bir ID girin.");
            return;
        }

        boolean updated = false;
        // Varlıklar listesini dolaşarak doğru binayı bulalım
        for (int i = 0; i < varliklar.size(); i++) {
            if (varliklar.get(i) instanceof Bina && varliklar.get(i).getId().equals(id)) {
                // Yeni bilgiler için kullanıcıdan veri al
                String yeniTip = JOptionPane.showInputDialog("Yeni Tip:");
                String yeniKatSayisiStr = JOptionPane.showInputDialog("Yeni Kat Sayısı:");
                String yeniEnerjiVerimliligi = JOptionPane.showInputDialog("Yeni Enerji Verimliliği:");

                // Bina güncelleniyor
                Bina bina = (Bina) varliklar.get(i);
                bina.setTip(yeniTip);
                bina.setKatSayisi(Integer.parseInt(yeniKatSayisiStr));
                

                // Bina list modelindeki öğeyi güncelle
                int listModelIndex = findIndexInListModel(binaListModel, id);
                if (listModelIndex != -1) {
                    binaListModel.set(listModelIndex, "Bina ID: " + id + ", Tip: " + yeniTip + ", Kat Sayısı: " + yeniKatSayisiStr + ", Enerji Verimliliği: " + yeniEnerjiVerimliligi);
                }

                updated = true;
                JOptionPane.showMessageDialog(null, "Bina güncellendi: " + id);
                break;
            }
        }
        if (!updated) {
            JOptionPane.showMessageDialog(null, "Bina bulunamadı: " + id);
        }
    }

    // Bina listesinde ID'ye göre index bulma fonksiyonu
    private int findIndexInListModel(DefaultListModel<String> listModel, String id) {
        for (int i = 0; i < listModel.size(); i++) {
            // Listede bina id'siyle eşleşen öğe varsa, index'i döndür
            if (listModel.get(i).contains(id)) {
                return i;
            }
        }
        return -1; // Eğer id bulunmazsa -1 döndür
    }
});

// Ekleme paneline butonu ekleyin
eklemePanel.add(binaGuncelleButton);
        // Enerji Kaynağı Güncelle Button
JButton enerjiKaynagiGuncelleButton = new JButton("Enerji Kaynağı Güncelle");
enerjiKaynagiGuncelleButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog("Güncellemek istediğiniz enerji kaynağı ID'sini girin:");

        // Eğer ID boşsa, işlem yapılmaz
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Geçerli bir ID girin.");
            return;
        }

        boolean updated = false;
        // Varlıklar listesini dolaşarak doğru enerji kaynağını bulalım
        for (int i = 0; i < varliklar.size(); i++) {
            if (varliklar.get(i) instanceof EnerjiKaynagi && varliklar.get(i).getId().equals(id)) {
                // Yeni bilgiler için kullanıcıdan veri al
                String yeniTip = JOptionPane.showInputDialog("Yeni Tip:");
                String yeniKapasiteStr = JOptionPane.showInputDialog("Yeni Kapasite:");

                // Enerji kaynağını güncelle
                EnerjiKaynagi enerjiKaynagi = (EnerjiKaynagi) varliklar.get(i);
                enerjiKaynagi.setTip(yeniTip);
                enerjiKaynagi.setKapasite(Integer.parseInt(yeniKapasiteStr));

                // Enerji kaynağı list modelindeki öğeyi güncelle
                int listModelIndex = findIndexInListModel(enerjiKaynağıListModel, id);
                if (listModelIndex != -1) {
                    enerjiKaynağıListModel.set(listModelIndex, "Enerji Kaynağı ID: " + id + ", Tip: " + yeniTip + ", Kapasite: " + yeniKapasiteStr);
                }

                updated = true;
                JOptionPane.showMessageDialog(null, "Enerji Kaynağı güncellendi: " + id);
                break;
            }
        }
        if (!updated) {
            JOptionPane.showMessageDialog(null, "Enerji Kaynağı bulunamadı: " + id);
        }
    }

    // Enerji kaynağı listesinde ID'ye göre index bulma fonksiyonu
    private int findIndexInListModel(DefaultListModel<String> listModel, String id) {
        for (int i = 0; i < listModel.size(); i++) {
            // Listede enerji kaynağı id'siyle eşleşen öğe varsa, index'i döndür
            if (listModel.get(i).contains(id)) {
                return i;
            }
        }
        return -1; // Eğer id bulunmazsa -1 döndür
    }
});

// Ekleme paneline butonu ekleyin
        eklemePanel.add(enerjiKaynagiGuncelleButton);
        eklemePanel.add(aracEkleButton);
        eklemePanel.add(binaEkleButton);
        eklemePanel.add(enerjiEkleButton);
        eklemePanel.add(aracSilButton);
        eklemePanel.add(binaSilButton);
        eklemePanel.add(enerjiSilButton);
         // Ana panelde tüm bileşenleri yerleştiriyoruz
        tabbedPane.addTab("Araçlar", aracPanel);
        tabbedPane.addTab("Binalar", binaPanel);
        tabbedPane.addTab("Enerji Kaynakları", enerjiPanel);
        tabbedPane.addTab("Şehir Hizmetleri", hizmetPanel);
        tabbedPane.addTab("Varlık İşlemleri", eklemePanel);
        

        add(varlikButtonPanel, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);
    }
    


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                AdminPanel adminPanel = new AdminPanel();
                adminPanel.setVisible(true);
            }
        });
    }
}
