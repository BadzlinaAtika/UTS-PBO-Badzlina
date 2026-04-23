package Jawaban2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int totalKendaraan = 0;
        double totalPendapatan = 0;
        String tambahLagi;

        System.out.println("SelamatDatang di ParkingChan");

        do {
            System.out.println("Masukkan Jenis Kendaaraan Mobil/Motor/Truk :");
            String jenis = sc.next();
            Kendaraan k = new Kendaraan(jenis);

            System.out.println("Berapa lama parkir(manual/jam): ");
            String mode = sc.next();

            if (mode.equalsIgnoreCase("Manual")){
                System.out.println("Masukkan durasi parkir: ");
                k.hitungBiaya(sc.nextInt());
            } else {
                System.out.println("Masukkan jam masuk: ");
                int masuk = sc.nextInt();
                System.out.println("Masukkan jam keluar: ");
                int keluar = sc.nextInt();
                k.hitungBiaya(masuk, keluar);
            }

            System.out.println("===SUMMARY===");
            System.out.println("Jenis Kendaraan: " + k.getJenis());
            System.out.println("Durasi Parkir : " + k.getDurasi());
            System.out.println("Total :Rp. " + k.getTotalBiaya());

            totalPendapatan += k.getTotalBiaya();
            totalKendaraan++;

            System.out.println("\nIngin Masukkan jenis kendaraan lain? (y/t)");
            tambahLagi = sc.next();
        } while (tambahLagi.equalsIgnoreCase("y"));

        System.out.println("===HASIL AKHIR===");
        System.out.println("Total jenis kendaraan: " + totalKendaraan);
        System.out.println("Total biaya :Rp. " + totalPendapatan);
    }
}
