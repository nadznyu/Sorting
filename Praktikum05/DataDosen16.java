package Praktikum05;

public class DataDosen16 {
    Dosen16[] dataDosen16 = new Dosen16[10];
    int idx;

    void tambah(Dosen16 dsn) {
        if (idx < 10) {
            dataDosen16[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data Dosen.");
            return;
        }
        System.out.println("===== DATA SELURUH DOSEN =====");
        for (int i = 0; i < idx; i++) {
            System.out.println("Data ke-" + (i + 1) + " : ");
            dataDosen16[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < dataDosen16.length - 1; i++) {
            for (int j = 0; j < dataDosen16.length - i - 1; j++) {
                if (dataDosen16[j].usia > dataDosen16[j + 1].usia) {
                    Dosen16 tmp = dataDosen16[j];
                    dataDosen16[j] = dataDosen16[j + 1];
                    dataDosen16[j + 1] = tmp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < dataDosen16.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen16.length; j++) {
                if (dataDosen16[j].usia > dataDosen16[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen16 temp = dataDosen16[idxMax];
            dataDosen16[idxMax] = dataDosen16[i];
            dataDosen16[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen16.length; i++) {
            Dosen16 key = dataDosen16[i];
            int j = i;
            while (j > 0 && dataDosen16[j - 1].usia < key.usia) {
                dataDosen16[j] = dataDosen16[j - 1];
                j--;
            }
            dataDosen16[j] = key;
        }
    }

}
