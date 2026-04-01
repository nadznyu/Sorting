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

    