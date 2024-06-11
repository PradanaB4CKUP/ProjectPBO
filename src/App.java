import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Project Kelompok PBO");
        

        String namaPetugas;
        Date date = new Date();
        String tanggal = date.toString();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nama petugas : ");
        namaPetugas = br.readLine();
        
        System.out.print("Masukkan jumlah user : ");
        int jumlah = Integer.parseInt(br.readLine());
        String[] nama = new String[jumlah];
        String[] alamat = new String[jumlah];
        String[] noHp = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama : ");
            nama[i] = br.readLine();
            System.out.print("Masukkan alamat : ");
            alamat[i] = br.readLine();
            System.out.print("Masukkan nomor hp : ");
            noHp[i] = br.readLine();

            System.out.println("==========================");
            System.out.println("======= input user =======");
            System.out.println("Masukkan jumlah jenis sampah yang ingin dibuang :");
            int jumlahSampah = Integer.parseInt(br.readLine());
            String[] input1 = new String[jumlahSampah];
            int[] input2 = new int[jumlahSampah];

            for (int j = 0; j < jumlahSampah; j++) {
                System.out.println("--------------------------------");
                System.out.println("Pilih Jenis Sampah");
                System.out.println("1. Sampah Rumah Tangga");
                System.out.println("2. Sampah Organik");
                System.out.println("3. Sampah NonOrganik");
                System.out.println("--------------------------------");
                System.out.println("Jenis Sampah : "); input1[j] = br.readLine();
                System.out.println("Berat Sampah (Kg) : "); input2[j] = Integer.parseInt(br.readLine());
                System.out.println("--------------------------------");

            }

            trashType objType = new trashType(input1, input2);
            System.out.println("Jenis Sampah : " + objType.getJenisSampah()[i]);
        }

        user user = new user(nama, alamat, noHp);
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama : " + user.getNama()[i]);
            System.out.println("Alamat : " + user.getAlamat()[i]);
            System.out.println("Nomor HP : " + user.getNoHp()[i]);
        }
        
        
        System.out.print("Hormat Kami");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Nama Petugas : " + namaPetugas);
        System.out.println("==========================");
    }
}
