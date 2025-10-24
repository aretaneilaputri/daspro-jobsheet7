# daspro-jobsheet7

Pertanyaan Percobaan 1
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!

Jawaban Percobaan 1
1. Kode Perulangan FOR terdiri dari 3 komponen yanitu inisialisai "int i = 1"untuk menentukan nilai awal variabel penghitung (i dimulai dari 1), kondisi " i <= 10" untuk menentukan kapan perulangan berhenti.selama kondisi ini benar,maka perulangan akan terus berjalan,update "i++" gunanay setelah satu kali perulangan selesai,3 nilai i akan bertambah 1. yang terkumpul di "blok perulangan" Berisi perintah yang dijalankan berulang, seperti meminta input dan memeriksa nilai.

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
Jawab: nilai tertinggi diisi 0 karena nilai mahasiswa pasti lebih besar dari 0, jadi ketika program dijalankan nilai pertama pasti akan langsung menggantikan nilai awal 0 itu.Sedangkan  nilai terendah diisi 100 karena nilai mahasiswa tidak mungkin lebih dari 100 jadi nilai pertama pasti akan lebih kecil dan langsung menggantikan anggka 100 itu. Jika dibalik maka hasilnya akan salah karena nilai tertinggi tidak akan lebih besar dari 100 jadi nilainya tidak akan berubah,dan nilai terendah tidak akan lebih kecil dari 0 jadi nilainya tidak akan berubah akhirnya hasil akhir selalu tertinggi = 100 dan terendah = 0

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
     if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
Jawab: Fungsinya untuk memperbarui nilai tertinggi dan terendah setiap kali pengguna memasukkan nilai baru.
Alur kerjanya 
1. Saat nilai mahasiswa dimasukkan, program membandingkannya dengan tertinggi dan terendah.
2. Jika nilai lebih besar dari tertinggi, maka nilai tersebut disimpan sebagai nilai tertinggi baru.
3. Jika nilai lebih kecil dari terendah, maka nilai tersebut disimpan sebagai nilai terendah baru.
4. Proses ini diulang setiap kali input baru diberikan.
Jadi hasil akhirnya setelah semua nilai dimasukkan, tertinggi berisi nilai paling besar dan terendah berisi nilai paling kecil dari semua input.

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!

5. Commit dan push kode program ke Github


Pertanyaan Percobaan 2
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
     if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan ulang.");
                continue;
            }

Jawab: "if (nilai < 0 || nilai > 100)" 
bagian ini adalah kondisi percabangan.Operator || adalah OR logika, artinya kondisi akan benar jika salah satu atau kedua syaratnya benar.Jadi kondisi ini akan benar jika nilai < 0 → nilai yang dimasukkan kurang dari 0 atau nilai > 100 → nilai yang dimasukkan lebih dari 100
Maksudnya adalah untuk memeriksa apakah nilai berada di luar rentang 0–100.
"System.out.println("Nilai tidak valid. Masukkan ulang.");"
Jika kondisi if benar, maka program akan menampilkan pesan ke pengguna:"Nilai tidak valid. Masukkan ulang."Ini memberi tahu pengguna bahwa input yang dimasukkan tidak sesuai dengan aturan (0–100).
"continue;" 
continue digunakan di dalam loop (for, while, atau do-while).Fungsinya adalah melewatkan sisa kode di dalam iterasi saat ini dan langsung kembali ke awal loop untuk iterasi berikutnya.Dalam konteks ini, artinya Program tidak memproses nilai yang salah, langsung meminta input ulang.

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?

Jawaban: i adalah penghitung mahasiswa yang sudah valid.Kalau ditaruh di awal maka kita akan menambah penghitung sebelum input diterima, sehingga indeks mahasiswa bisa keliru.Dengan menaruh i++ di akhir maka kita hanya menghitung mahasiswa yang valid.Jadi kesimpulannya adalah i++ di akhir loop maka nilai saat ini diproses dulu, baru dinaikkan.jika i++ di awal loop maka nilai dinaikkan dulu, baru diproses.Maka dari itu posisi i++ memengaruhi urutan nilai yang diproses dan apakah nilai awal digunakan.