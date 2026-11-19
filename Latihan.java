import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Latihan extends JFrame implements ActionListener { 
    GridLayout layoutUtama;
    FlowLayout layoutInput;

    JPanel panelInput;
    JPanel panelHasil;

    JLabel labelNama;
    JTextField fieldNama;
    JButton tombolSapa;
    JLabel labelHasil;

    public Latihan() {
        layoutUtama = new GridLayout(2, 1);
        layoutInput = new FlowLayout();

        panelInput = new JPanel();
        panelHasil = new JPanel();

        labelNama = new JLabel("Nama:");
        fieldNama = new JTextField(12);
        tombolSapa = new JButton("Sapa");
        labelHasil = new JLabel("Silakan isi nama");

        tombolSapa.addActionListener(this);

        panelInput.add(labelNama);
        panelInput.add(fieldNama);
        panelInput.add(tombolSapa);
        panelInput.setLayout(layoutInput);
        panelHasil.add(labelHasil);

        add(panelInput);
        add(panelHasil);
        setLayout(layoutUtama);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Latihan GUI");
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        labelHasil.setText("Halo, " + fieldNama.getText());
    }

    public static void main(String[] args) {
        Latihan latihan = new Latihan();
        latihan.setVisible(true);
    }
}