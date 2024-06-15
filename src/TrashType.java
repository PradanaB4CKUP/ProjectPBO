public class TrashType {
    private String jenisSampah;
    private int berat;
    private double harga;

    public TrashType(String jenisSampah, int berat) {
        this.jenisSampah = jenisSampah;
        this.berat = berat;
        setHarga(jenisSampah);
    }

    public String getJenisSampah() {
        return jenisSampah;
    }

    public int getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }

    private void setHarga(String jenisSampah) {
        switch (jenisSampah) {
            case "1":
                this.jenisSampah = "Sampah Rumah Tangga";
                this.harga = 30000.0;
                break;
            case "2":
                this.jenisSampah = "Sampah Organik";
                this.harga = 10000.0;
                break;
            case "3":
                this.jenisSampah = "Sampah NonOrganik";
                this.harga = 50000.0;
                break;
            default:
                this.jenisSampah = "Sampah Khusus";
                this.harga = 15000.0;
                break;
        }
    }
}