package Jawaban1;
import java.util.ArrayList;

public class Perusahaan {
    private ArrayList<Karyawan> daftarKaryawan;

    public Perusahaan(){
        this.daftarKaryawan = new ArrayList<>();
    }

    //tambah karyawan dengan menyebutkan id
    public boolean tambahKaryawan(Karyawan k){
        for (Karyawan ex : daftarKaryawan){
            if (ex.getId().equals(k.getId())){
                System.out.println("Sudah ada ID karyawan!");
                return false;
            }
        }
        daftarKaryawan.add(k);
        return true;
    }

    //cari karyawan berdasarkan id yg sudah di set diawal
    public Karyawan cariKaryawan(String id){
        for (Karyawan k : daftarKaryawan){
            if (k.getId().equals(id)) return k;
        }
        return null;
    }

    //hapus karyawan
    public boolean hapusKaryawan(String id){
        Karyawan k = cariKaryawan(id);
        if (k != null){
            daftarKaryawan.remove(k);
            return true;
        }
        return false;
    }

    //tampilkan semua data
    public void tampilkanSeluruhKaryawan(){
        if (daftarKaryawan.isEmpty()){
            System.out.println("Data Karyawan KOsong");
        } else {
            for (Karyawan k : daftarKaryawan){
                System.out.println(k);
            }
        }
    }
}
