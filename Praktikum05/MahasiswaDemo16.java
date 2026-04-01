package Praktikum05;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
        Mahasiswa16 m1 = new Mahasiswa16("123", "Zidan", "2A", 3.2);
        Mahasiswa16 m2 = new Mahasiswa16("124", "Ayu", "2A", 3.5);
        Mahasiswa16 m3 = new Mahasiswa16("125", "Sofi", "2A", 3.1);
        Mahasiswa16 m4 = new Mahasiswa16("126", "Sita", "2A", 3.9);
        Mahasiswa16 m5 = new Mahasiswa16("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunaan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
