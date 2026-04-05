package Praktikum05;

import java.util.Scanner;

public class DosenMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen16 dd = new DataDosen16();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan data dosen ke-" + i);
            System.out.print("Kode dosen  : ");
            String kodeDosen = sc.nextLine();
            System.out.print("Nama dosen  : ");
            String nmDosen = sc.nextLine();
            System.out.print("Jenis Kelamin (true:laki-laki / false:perempuan) : ");
            boolean jk = sc.nextBoolean();
            System.out.print("Usia        : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------");

            dd.tambah(new Dosen16(kodeDosen, nmDosen, jk, usia));
        }
        System.out.println("Data yang sudah terurut menggunakan Bubble Sort (ASC)    : ");
        dd.SortingASC();
        dd.tampil();

        System.out.println("Data yang sudah terurut menggunakan Selection Sort (DSC) : ");
        dd.SortingDSC();
        dd.tampil();

        System.out.println("Data yang sudah terurut menggunakan Insertion Sort (DSC) : ");
        dd.insertionSort();
        dd.tampil();
    }

}
