***Praktikum 1***
1. Jelaskan fungsi kode program berikut
    if (data[j-1] > data[j]) {
       temp = data[j];
       data[j] = data[j-1];
       data[j-1] = temp;
    }
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
   while (j >= 0 && data[j] > temp)  
4. Pada Insertion sort, apakah tujuan dari perintah
   data[j+1] = data[j];

***Jawaban Praktikum 1***
1. Kode ini berfungsi untuk menukar posisi dua elemen yang bersebelahan jika elemen kiri (data[j-1]) lebih 
   besar dari elemen kanan (data[j]). Ini adalah inti dari Bubble Sort - elemen yang lebih besar "menggelembung" ke seiap iterasi.
2. int min = i;
   for (int j = i+1; j < jumData; j++) {
        if (data[j] < data[min]) {
            min = j;
        }
    }
    bagian ini mencari indeks elemen terkecil dari posisi i sampai akhir array, lalu nantinya ditukar ke posisi i.
3. - j >= 0 : memastikan indeks tidak keluar batas array (tidak minus).
   - data[j] > temp : selama elemen sebelumnya masih lebih besar dari elemen yang sedang dipegang (temp),
                      akan terus geser ke kanan.
    perulangan berhenti kalau sudah sampai ujung kiri array atau sudah bertemu dengan posisi yang tepat.
4. Perintah ini berfungsi untuk menggeser elemen ke kanan satu posisi, untuk membuat "ruang kosong" agar 
   elemen temp bisa disisipkan di posisi yang tepat. Tanpa pergeseran ini, elemen lama akan tertimpa sebelum sempat dipindah.

***Praktikum 2***
1.	Perhatikan perulangan di dalam bubbleSort() di bawah ini:
    for (int i = 0; i < listMhs.length-1; i++) {
        for (int j = 1; j < listMhs.length-i; j++) {
    }
}
a.	Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
b.	Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
c.	Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada 
    berapa Tahap bubble sort yang ditempuh?
2.	Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri 
    dari nim, nama, kelas, dan ipk!

***Jawaban Praktikum 2***
1a. Karena perulangan i menandai tahap bubble sort. Kalau ada 5 data hanya butuh 4 tahap untuk memastikan 
    semua data terurut, dan di tahap terakhir elemen sudah otomatis di posisi yang benar. Makanya pakai length-1, jadi tidak perlu sampai length.
1b. Karena setiap selesai 1 tahap (1 putaran i), elemen terbesar sudah "menggelembung" ke posisi paling 
    akhir dan tidak perlu dibandingkan lagi. 
1c. - Perulangan i berlangsung sebanyak 49 kali (dari i = 0 sampai i = 48, karena syaranya i < 50-1).
    - Tahap bubble sort yang yang ditempuh juga 49 tahap.
2. Sudah commit.

***Pertanyaan poin 5.3.7***
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
int idxMin = i;
for (int j = i+1; j < listMhs.length; j++) {
    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
        idxMin = j;
    }
}
Untuk apakah proses tersebut, jelaskan!

***Jawaban Pertanyaan poin 5.3.7***
idxMin menyimpan posisi mahasiswa dengan IPK terkecil di sisa array yang belum terurut. Indeks ini kemudian digunakan untuk menukar elemen di posisi i dengan elemen terkecil tersebut, sehingga data terurut dari IPK terkecil ke terbesar (ASC).

***Pertanyaan poin 5.4.3***
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.

***Jawaban Pertanyaan poin 5.4.3***
Sudah di commit dengan judul Modifikasi Insertion Sort
    