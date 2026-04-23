package Jawaban1;

public class Karyawan {
    private String id;
    private String nama;
    private String posisi;
    private double gaji;

    public Karyawan(String id, String nama, String posisi, double gaji){
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    public String getId(){return id;}
    public String getNama(){return nama;}
    public String getPosisi(){return posisi;}
    public void setposisi(String posisi) {this.posisi = posisi;}
    public double getGaji() {return gaji;}


    @Override
    public String toString(){
        return "ID: " + id + ", Nama: " + nama + ", Posisi: " + posisi + ", Gaji: Rp " + String.format("%.1f", gaji);
    }
    }
