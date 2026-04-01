package Praktikum05;

import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + i);
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("----------------------------");

            list.tambah(new Mahasiswa16(nim, nama, kelas, ipk));
        }
            System.out.println("Data yang sudah terurut menggunakan BUBBLE SORT (DESC) : ");
            list.bubbleSort();
            list.tampil();

            System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
            list.selectionSort();
            list.tampil();

            System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC) : ");
            list.insertionSort();
            list.tampil();
    }
}
