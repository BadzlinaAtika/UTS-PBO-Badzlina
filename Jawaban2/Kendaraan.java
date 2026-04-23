package Jawaban2;

public class Kendaraan {
    private String jenis;
    private int durasi;
    private double biayaPerJam;

    public Kendaraan (String jenis){
        this.jenis = jenis;

        switch (jenis.toLowerCase()){
            case "motor": this.biayaPerJam = 3000; break;
            case "mobil": this.biayaPerJam = 5000; break;
            case "truk": this.biayaPerJam = 10000; break;
            default: this.biayaPerJam = 2000;
        }
    }

    //input durasi
    public void hitungBiaya(int durasi){
        this.durasi = durasi;
    }

    //input jam masuk dan keluar
    public void hitungBiaya(int masuk, int keluar){
        this.durasi = keluar - masuk;
    }

    public double getTotalBiaya(){
        double total = this.durasi * this.biayaPerJam;
        if (this.durasi > 5){
            total = total * 0.9;
        }
        return total;
    }

    public String getJenis() {return jenis;}
    public int getDurasi() {return durasi;}


}
