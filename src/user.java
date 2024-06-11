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
    // public void setNama(String[] nama) {
    //     this.nama = nama;
    // }
    // public void setAlamat(String[] alamat) {
    //     this.alamat = alamat;
    // }
    // public void setNoHp(String[] noHp) {
    //     this.noHp = noHp;
    // }
    
}
