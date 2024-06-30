import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class App extends JFrame {

    private JTextField namaPetugasField;
    private JTextField jumlahUserField;
    private JTextArea outputArea;

    public App() {
        setTitle("Project Kelompok PBO");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel namaPetugasLabel = new JLabel("Masukkan nama petugas: ");
        namaPetugasField = new JTextField(20);
        JLabel jumlahUserLabel = new JLabel("Masukkan jumlah user: ");
        jumlahUserField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        outputArea = new JTextArea(20, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(namaPetugasLabel);
        add(namaPetugasField);
        add(jumlahUserLabel);
        add(jumlahUserField);
        add(submitButton);
        add(scrollPane);

        submitButton.addActionListener(new SubmitButtonListener());

        setVisible(true);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String namaPetugas = namaPetugasField.getText();
                int jumlahUser = Integer.parseInt(jumlahUserField.getText());

                String[] nama = new String[jumlahUser];
                String[] alamat = new String[jumlahUser];
                String[] noHp = new String[jumlahUser];

                for (int i = 0; i < jumlahUser; i++) {
                    nama[i] = JOptionPane.showInputDialog("Masukkan nama user " + (i + 1) + ": ");
                    alamat[i] = JOptionPane.showInputDialog("Masukkan alamat user " + (i + 1) + ": ");
                    noHp[i] = JOptionPane.showInputDialog("Masukkan nomor hp user " + (i + 1) + ": ");

                    int jumlahSampah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah jenis sampah yang ingin dibuang untuk user " + (i + 1) + ": "));
                    String[] input1 = new String[jumlahSampah];
                    int[] input2 = new int[jumlahSampah];

                    for (int j = 0; j < jumlahSampah; j++) {
                        String jenisSampah = JOptionPane.showInputDialog("Pilih jenis sampah (1. Sampah Rumah Tangga, 2. Sampah Organik, 3. Sampah NonOrganik) untuk user " + (i + 1) + ": ");
                        int beratSampah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan berat sampah (Kg) untuk jenis " + jenisSampah + " user " + (i + 1) + ": "));
                        input1[j] = jenisSampah;
                        input2[j] = beratSampah;
                    }

                    trashType objType = new trashType(input1, input2);
                    for (int j = 0; j < jumlahSampah; j++) {
                        objType.setJenisSampah(input1[j], j);
                    }
                    objType.calculateTotal();
                    
                    outputArea.append("Nama: " + nama[i] + "\n");
                    outputArea.append("Alamat: " + alamat[i] + "\n");
                    outputArea.append("Nomor HP: " + noHp[i] + "\n");
                    outputArea.append(objType.hasil());
                }

                Date date = new Date();
                String tanggal = date.toString();
                outputArea.append("Hormat Kami\n");
                outputArea.append("Tanggal: " + tanggal + "\n");
                outputArea.append("Nama Petugas: " + namaPetugas + "\n");
                outputArea.append("==========================\n");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(App.this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
