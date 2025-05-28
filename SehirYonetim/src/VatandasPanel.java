import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VatandasPanel extends JFrame {

    // Şehir hizmetlerine ait veriler
    private int trafikYoğunluğu = 60; // Trafik yoğunluğu örneği (%0 - %100)
    private float enerjiÜretimi = 100; // Enerji üretimi (MW cinsinden)
    private float enerjiTüketimi = 90; // Enerji tüketimi (MW cinsinden)
    private float suRezervi = 50; // Su rezervi (milyon litre cinsinden)

    public VatandasPanel() {
        setTitle("Vatandaş Panel");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Şehir Hizmetleri İzleme ve Raporlama Butonları
        JButton trafikButton = createButton("Trafik Durumu Raporla", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Trafik Yoğunluğu: " + trafikYoğunluğu + "%");
            }
        });

        JButton enerjiButton = createButton("Enerji Durumu Raporla", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (enerjiÜretimi < enerjiTüketimi) {
                    JOptionPane.showMessageDialog(null, "Enerji üretimi tüketimi karşılamıyor.");
                } else {
                    JOptionPane.showMessageDialog(null, "Enerji durumu yeterli.");
                }
            }
        });

        JButton suButton = createButton("Su Durumu Raporla", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (suRezervi < 10) {
                    JOptionPane.showMessageDialog(null, "Su rezervi %10'un altına düştü.");
                } else {
                    JOptionPane.showMessageDialog(null, "Su durumu yeterli.");
                }
            }
        });

        // Butonları bir panelde düzenleyelim
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(trafikButton, gbc);

        gbc.gridy = 1;
        buttonPanel.add(enerjiButton, gbc);

        gbc.gridy = 2;
        buttonPanel.add(suButton, gbc);

        // Paneli ekleyelim
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String text, ActionListener action) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 50));
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.addActionListener(action);
        return button;
    }

    public static void main(String[] args) {
        new VatandasPanel(); // Vatandaş panelini başlat
    }
}
