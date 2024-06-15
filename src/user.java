import java.util.ArrayList;
import java.util.List;

public class user {
    private String nama;
    private String alamat;
    private String noHp;
    private List<TrashType> trashTypes;

    public user(String nama, String alamat, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.trashTypes = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public List<TrashType> getTrashTypes() {
        return trashTypes;
    }

    public void setTrashTypes(List<TrashType> trashTypes) {
        this.trashTypes = trashTypes;
    }
}