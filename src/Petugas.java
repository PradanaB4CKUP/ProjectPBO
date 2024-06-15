import java.util.Date;

public class Petugas {
    private String nama;
    private Date tanggal;

    public Petugas(String nama, Date tanggal) {
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggal() {
        return tanggal;
    }
}