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

