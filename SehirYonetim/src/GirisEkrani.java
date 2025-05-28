import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GirisEkrani extends JFrame {

    // Admin giriş bilgileri
    private static final String ADMIN_KULLANICI_ADI = "admin";
    private static final String ADMIN_SIFRE = "admin123";

    public GirisEkrani() {
        setTitle("Giriş Ekranı");
        setSize(600, 400);  // Genişlik ve yükseklik
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Ekranın ortasında açılacak

        // Ana panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(238, 238, 238)); // Açık gri arka plan

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Butonlar arasına boşluk eklemek için

        // Başlık
        JLabel titleLabel = new JLabel("Akıllı Şehir Yönetim Sistemi", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
        titleLabel.setForeground(new Color(56, 87, 137));  // Başlık rengi mavi
        gbc.gridx = 0;  // Başlığı sola hizalayalım
        gbc.gridy = 0;
        gbc.gridwidth = 0;
        mainPanel.add(titleLabel, gbc);

        // Admin Giriş Butonu
        JButton adminButton = new JButton("Admin Girişi");
        styleButton(adminButton, new Color(100, 180, 70), new Color(255, 255, 255));

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel loginPanel = new JPanel();
                loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));

                JLabel kullaniciAdiLabel = new JLabel("Kullanıcı Adı:");
                JTextField kullaniciAdiField = new JTextField();
                JLabel sifreLabel = new JLabel("Şifre:");
                JPasswordField sifreField = new JPasswordField();

                loginPanel.add(kullaniciAdiLabel);
                loginPanel.add(kullaniciAdiField);
                loginPanel.add(sifreLabel);
                loginPanel.add(sifreField);

                int option = JOptionPane.showConfirmDialog(null, loginPanel, "Admin Girişi", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    String kullaniciAdi = kullaniciAdiField.getText();
                    String sifre = new String(sifreField.getPassword());

                    if (kullaniciAdi.equals(ADMIN_KULLANICI_ADI) && sifre.equals(ADMIN_SIFRE)) {
                        dispose();  // Giriş ekranını kapat
                        new AdminPanel().setVisible(true); // Admin panelini aç
                    } else {
                        JOptionPane.showMessageDialog(null, "Hatalı kullanıcı adı veya şifre!");
                    }
                }
            }
        });

        // Vatandaş Giriş Butonu
        JButton vatandasButton = new JButton("Vatandaş Girişi");
        styleButton(vatandasButton, new Color(56, 87, 137), new Color(255, 255, 255)); // Butonları renkli yaptık

        vatandasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Giriş ekranını kapat
                new VatandasPanel().setVisible(true); // Vatandaş panelini aç
            }
        });

        // Butonları yerleştirelim
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        mainPanel.add(adminButton, gbc);

        gbc.gridy = 2; // Vatandaş butonunun altına ekleyelim
        mainPanel.add(vatandasButton, gbc);

        // Ana panele ekleyelim
        add(mainPanel);
        setVisible(true);
    }

    private void styleButton(JButton button, Color bgColor, Color fgColor) {
        // Buton tasarımı
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFocusPainted(false);  // Buton etrafındaki odak çizgisini kaldırdık
        button.setBorder(BorderFactory.createLineBorder(bgColor, 2)); // Kenarlık
        button.setPreferredSize(new Dimension(200, 40)); // Buton boyutu

        // Hover efekti
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(bgColor.darker());  // Hover rengi
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(bgColor);  // Normal rengi
            }
        });
    }

    public static void main(String[] args) {
        new GirisEkrani(); // Giriş ekranını başlat
    }
}
