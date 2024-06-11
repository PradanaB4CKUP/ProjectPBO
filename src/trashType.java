import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trashType {
    int[] berat;
    int maks;
    String[] jenisSampah, input1, input2;
    Double total;
    Double harga;
    BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));

    public trashType(String[] jenisSampah, int[] berat) throws IOException {
        this.berat = berat;
        this.jenisSampah = jenisSampah;

        // System.out.println("--------------------------------");
        // System.out.println("Pilih Jenis Sampah");
        // System.out.println("1. Sampah Rumah Tangga");
        // System.out.println("2. Sampah Organik");
        // System.out.println("3. Sampah NonOrganik");
        // System.out.println("--------------------------------");
        // System.out.println("Jenis Sampah : "); input1 = inputData.readLine();

        // System.out.println("--------------------------------");
        // System.out.println("Berat Sampah (Kg) : "); input2 = inputData.readLine();
        // berat = Integer.parseInt(input2);
        // System.out.println("--------------------------------");
        // setJenisSampah(jenisSampah);
        

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
    public Double harga() {
        return harga;
    }
    public int maks(){
        return maks;
    }

    public void setJenisSampah(String jenisSampah) throws IOException{
        switch (jenisSampah) {
            case "1":
                    System.out.println("Sampah Rumah Tangga");
                    jenisSampah = "Sampah Rumah Tangga";
                break;
            case "2":
                    System.out.println("Sampah Organik");
                    jenisSampah = "Sampah Organik";
                break;
            case "3":
                    System.out.println("Sampah NonOrganik");
                    jenisSampah = "Sampah NonOrganik";
                break;
            default:
                    System.out.println("Jenis Sampah Tidak Tersedia");
                    System.out.println("Silahkan Masukkan Jenis Sampah Yang Tersedia");
                    setJenisSampah(jenisSampah);
                break;
        }
    }

    public void getMaksByJenis(String jenisSampah){
        switch (jenisSampah) {
            case "Sampah Rumah Tangga":
                maks = 5;
                break;
            case "Sampah Organik":
                maks = 3;
                break;
            case "Sampah NonOrganik":
                maks = 5;
                break;
            default:
                System.out.println("masuk sampah khusus");
                break;
        }
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public void getHarga(String jenisSampah){
        switch (jenisSampah) {
            case "Sampah Rumah Tangga":
                harga = 30000.0;
                break;
            case "Sampah Organik":
                harga = 10000.0;
                break;
            case "Sampah NonOrganik":
                harga = 50000.0;
                break;
            default:
                System.out.println("masuk sampah khusus");
                harga = 15000.0;
                break;
        }
    }

    public void hasil(){
        System.out.println("--------------------------------");
        System.out.println("Jenis Sampah : " + jenisSampah);
        System.out.println("Berat Sampah : " + berat);
        System.out.println("Harga Sampah : " + harga);
        System.out.println("Total Harga : " + total);
        System.out.println("--------------------------------");
    }
}
