import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Project Kelompok PBO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tambahkan instance dari NewJPanel ke frame
        NewJPanel newPanel = new NewJPanel();
        frame.add(newPanel);

        // Set ukuran frame dan tampilkan
        frame.pack();
        frame.setSize(600, 700); // Atur ukuran sesuai kebutuhan Anda
        frame.setVisible(true);
    }
}
