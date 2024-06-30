import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trashType {
    int[] berat;
    int[] maks;
    String[] jenisSampah, input1, input2;
    Double[] harga;
    Double[] total;
    BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));

    public trashType(String[] jenisSampah, int[] berat) throws IOException {
        this.berat = berat;
        this.jenisSampah = jenisSampah;
        this.harga = new Double[jenisSampah.length];
        this.total = new Double[jenisSampah.length];
        this.maks = new int[jenisSampah.length];
        calculateTotal();
    }

    public int[] getBerat() {
        return berat;
    }

    public void setBerat(int[] berat) {
        this.berat = berat;
    }

    public String[] getJenisSampah() {
        return jenisSampah;
    }

    public Double[] getHarga() {
        return harga;
    }

    public int[] getMaks() {
        return maks;
    }

    public void setJenisSampah(String jenisSampah, int index) throws IOException {
        switch (jenisSampah) {
            case "1":
                this.jenisSampah[index] = "Sampah Rumah Tangga";
                this.maks[index] = 5;
                break;
            case "2":
                this.jenisSampah[index] = "Sampah Organik";
                this.maks[index] = 3;
                break;
            case "3":
                this.jenisSampah[index] = "Sampah NonOrganik";
                this.maks[index] = 5;
                break;
            default:
                this.jenisSampah[index] = "Sampah Khusus";
                this.maks[index] = Integer.MAX_VALUE;  // No limit for special trash
                break;
        }
    }

    public void getHarga(String jenisSampah, int index) {
        switch (jenisSampah) {
            case "Sampah Rumah Tangga":
                harga[index] = 30000.0;
                break;
            case "Sampah Organik":
                harga[index] = 10000.0;
                break;
            case "Sampah NonOrganik":
                harga[index] = 50000.0;
                break;
            default:
                harga[index] = 15000.0;
                break;
        }
    }

    public void calculateTotal() {
        for (int i = 0; i < jenisSampah.length; i++) {
            getHarga(jenisSampah[i], i);
            if (berat[i] > maks[i]) {
                harga[i] = null;  // Special condition
                total[i] = null;
            } else {
                total[i] = berat[i] * harga[i];
            }
        }
    }

    public String hasil() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jenisSampah.length; i++) {
            result.append("--------------------------------\n");
            result.append("Jenis Sampah: ").append(jenisSampah[i]).append("\n");
            result.append("Berat Sampah: ").append(berat[i]).append(" Kg\n");
            result.append("Harga Sampah: ").append(harga[i] != null ? harga[i] : "Masuk Sampah Khusus").append("\n");
            result.append("Total Harga: ").append(total[i] != null ? total[i] : "Null").append("\n");
            result.append("--------------------------------\n");
        }
        return result.toString();
    }
}
