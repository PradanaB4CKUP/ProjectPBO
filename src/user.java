public class user {
    String [] nama;
    String [] alamat;
    String [] noHp;

    public user(String[] nama, String[] alamat, String[] noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    public String[] getNama() {
        return nama;
    }
    public String[] getAlamat() {
        return alamat;
    }
    public String[] getNoHp() {
        return noHp;
    }
    
}
