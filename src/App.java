import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Project Kelompok PBO");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan nama petugas: ");
        String namaPetugas = br.readLine();
        
        Petugas petugas = new Petugas(namaPetugas, new Date());
        
        System.out.print("Masukkan jumlah user: ");
        int jumlahUser = Integer.parseInt(br.readLine());
        List<user> users = new ArrayList<>();

        for (int i = 0; i < jumlahUser; i++) {
            System.out.print("Masukkan nama: ");
            String nama = br.readLine();
            System.out.print("Masukkan alamat: ");
            String alamat = br.readLine();
            System.out.print("Masukkan nomor HP: ");
            String noHp = br.readLine();
            
            user user = new user(nama, alamat, noHp);

            System.out.print("Masukkan jumlah jenis sampah yang ingin dibuang: ");
            int jumlahSampah = Integer.parseInt(br.readLine());
            List<TrashType> trashTypes = new ArrayList<>();

            for (int j = 0; j < jumlahSampah; j++) {
                System.out.println("--------------------------------");
                System.out.println("Pilih Jenis Sampah");
                System.out.println("1. Sampah Rumah Tangga");
                System.out.println("2. Sampah Organik");
                System.out.println("3. Sampah NonOrganik");
                System.out.println("--------------------------------");
                System.out.print("Jenis Sampah: ");
                String jenisSampah = br.readLine();
                System.out.print("Berat Sampah (Kg): ");
                int berat = Integer.parseInt(br.readLine());
                
                TrashType trashType = new TrashType(jenisSampah, berat);
                trashTypes.add(trashType);
            }
            user.setTrashTypes(trashTypes);
            users.add(user);
        }

        for (user user : users) {
            System.out.println("==========================");
            System.out.println("Nama: " + user.getNama());
            System.out.println("Alamat: " + user.getAlamat());
            System.out.println("Nomor HP: " + user.getNoHp());
            for (TrashType trashType : user.getTrashTypes()) {
                System.out.println("Jenis Sampah: " + trashType.getJenisSampah());
                System.out.println("Berat Sampah: " + trashType.getBerat() + " Kg");
                System.out.println("Harga Sampah: " + trashType.getHarga() + " IDR");
            }
            System.out.println("==========================");
        }
        
        System.out.println("Hormat Kami");
        System.out.println("Tanggal: " + petugas.getTanggal());
        System.out.println("Nama Petugas: " + petugas.getNama());
        System.out.println("==========================");
    }
}