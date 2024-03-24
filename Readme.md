# Proyek: Sistem Manajemen Database Mahasiswa

Proyek ini merupakan aplikasi sederhana berbasis Java untuk mengelola catatan mahasiswa. Aplikasi ini memungkinkan pengguna untuk melakukan operasi dasar CRUD (Create, Read, Update, Delete) pada tabel database yang berisi informasi mahasiswa seperti NIM, nama, dan jenis kelamin.

## Fitur-fitur:

1. **Tambah Data Baru:** Pengguna dapat memasukkan catatan mahasiswa baru ke dalam database dengan menyediakan informasi NIM, nama, dan jenis kelamin.
2. **Perbarui Data:** Catatan yang sudah ada dapat diperbarui dengan informasi baru.
3. **Hapus Data:** Pengguna dapat menghapus catatan dari database.
4. **Lihat Data:** Aplikasi menampilkan semua catatan mahasiswa yang ada dalam format tabel.
5. **Penyorotan Pilihan:** Pengguna dapat memilih catatan dari tabel, dan informasinya akan ditampilkan dalam bidang input untuk dimodifikasi.
6. **Validasi Input:** Validasi input dasar diimplementasikan untuk memastikan bidang yang diperlukan tidak dibiarkan kosong.

## Teknologi yang Digunakan:

- Java
- Swing (untuk GUI)
- JDBC (Java Database Connectivity)

## Cara Menjalankan Aplikasi:

1. Pastikan Anda telah menginstal Java Development Kit (JDK) di sistem Anda.
2. Salin repositori ini ke mesin lokal Anda.
3. Kompilasi file Java menggunakan baris perintah atau IDE.
4. Pastikan Anda memiliki database yang kompatibel (misalnya, MySQL) terpasang dan berjalan di sistem Anda.
5. Perbarui detail koneksi database di file `Database.java` sesuai dengan konfigurasi database Anda.
6. Jalankan file `Menu.java` untuk menjalankan aplikasi.

## Skema Database:

Aplikasi ini menggunakan skema database sederhana dengan struktur tabel berikut:

```
CREATE TABLE mahasiswa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nim VARCHAR(10) UNIQUE,
    nama VARCHAR(50),
    jenis_kelamin VARCHAR(15)
);
```

## Koneksi Database:

File `Database.java` berisi metode untuk melakukan koneksi ke database menggunakan JDBC. Pastikan untuk memperbarui URL koneksi, nama pengguna, dan kata sandi sesuai dengan konfigurasi database Anda.

- [Saya Jason NIM 2204524 berjanji mengerjakan TP2 DPBO dengan keberkahan-Nya, maka saya tidak akan melakukan kecurangan sesuai yang telah dispesifikasikan, Aamiin.]

