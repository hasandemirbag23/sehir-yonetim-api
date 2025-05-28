import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("Şehir Yönetim Sistemi");  // Başlık Türkçeye çevrildi
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Kullanıcı Adı:");  // Kullanıcı adı etiketi Türkçeye çevrildi
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Şifre:");  // Şifre etiketi Türkçeye çevrildi
        JPasswordField passwordText = new JPasswordField();

        JButton loginButton = new JButton("Giriş Yap");  // Giriş butonu Türkçeye çevrildi
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                if (user.equals("admin") && password.equals("admin")) {
                    new AdminPanel().setVisible(true);  // Admin panelini aç
                    dispose();  // Giriş ekranını kapat
                } else {
                    JOptionPane.showMessageDialog(null, "Geçersiz kimlik bilgileri", "Hata", JOptionPane.ERROR_MESSAGE);  // Hata mesajı Türkçeye çevrildi
                }
            }
        });

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}
