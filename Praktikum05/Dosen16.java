package Praktikum05;

public class Dosen16 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen16(String kd, String nm, boolean jk, int age) {
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
        System.out.println("----------------------------");
    }
}
