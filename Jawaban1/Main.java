package Jawaban1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Perusahaan Perusahaan = new Perusahaan();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Sistem Manajemen Karyawan");
            System.out.println("1.Tambah Karyawan\n 2.Hapus KAryawan\n 3.Ubah Posisi\n 4.Ubah Gaji\n 5.Tampilkan Semua Karyawan\n 6.Keluar");
            System.out.println("Masukkan Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan ID : ");
                    String id = sc.nextLine();
                    System.out.println("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Posisi : ");
                    String posisi = sc.nextLine();
                    System.out.println("Masukkan Gaji : ");
                    double gaji = sc.nextDouble();

                    if (gaji < 0) {
                        System.out.println("Gaji gaboleh negatif!");
                    } else {
                        if (Perusahaan.tambahKaryawan(new Karyawan(id, nama, posisi, gaji))){
                            System.out.println("Karywan berhasil ditambah");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Masukkan ID yang mau dihapus: ");
                    if (Perusahaan.hapusKaryawan(sc.nextLine())){
                        System.out.println("Karyawan berhasil dihapus");
                    } else {
                        System.out.println("KArywan tidak ditemukan!");
                    }
                    break;

                case 5:
                    Perusahaan.tampilkanSeluruhKaryawan();
                    break;

                case 6:
                    System.out.println("Keluar");
                    break;
            }
        } while(pilihan != 6);
    }
}
