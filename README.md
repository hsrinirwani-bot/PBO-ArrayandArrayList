# Tugas 1 – Array dan ArrayList

**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Kelas:** 3B  
**Nama:**Jihadul Muhajirin Ahmad  
**Tahun:** 2026

## Deskripsi

Repositori ini berisi latihan materi **Array dan ArrayList** dalam bahasa Java. Program mencakup array dua dimensi untuk menampilkan negara dan ibu kota, pengelolaan objek `Account`, `Customer`, dan `Bank`, serta operasi dasar `ArrayList` pada daftar rekening.

## Daftar Program

| File | Keterangan |
|---|---|
| `CountryCapital.java` | Menampilkan pasangan negara dan ibu kotanya menggunakan array dua dimensi. |
| `Account.java` | Class pendukung untuk menyimpan dan mengelola saldo akun. |
| `Customer.java` | Menyimpan nama customer dan daftar account. |
| `Bank.java` | Mengelola data customer menggunakan array. |
| `BankTest.java` | Program utama untuk menguji class `Bank`, `Customer`, dan `Account`. |
| `BankAccount.java` | Class rekening yang menyimpan nomor rekening dan saldo. |
| `BankAccountArrayBeraksi.java` | Mempraktikkan operasi `add()`, `add(index, object)`, `remove()`, `get()`, dan `size()` pada `ArrayList`. |

## Persiapan

1. Pastikan Java Development Kit (JDK) sudah terpasang.
2. Buka folder repositori di Visual Studio Code.
3. Pastikan ekstensi Java untuk VS Code tersedia.
4. Buka terminal pada folder `src`.

## Cara Menjalankan

Jalankan perintah berikut dari dalam folder `src`:

### 1. Array dua dimensi

```bash
javac CountryCapital.java
java CountryCapital
```

### 2. Latihan Bank, Customer, dan Account

```bash
javac Account.java Customer.java Bank.java BankTest.java
java BankTest
```

### 3. ArrayList rekening

```bash
javac BankAccount.java BankAccountArrayBeraksi.java
java BankAccountArrayBeraksi
```

## Ringkasan Pengujian

Hasil yang diharapkan dari program berdasarkan kode latihan:

- `CountryCapital.java` menampilkan tujuh pasangan negara dan ibu kota.
- `BankTest.java` menampilkan tiga customer beserta saldo akhirnya.
- `BankAccountArrayBeraksi.java` menampilkan ukuran daftar `3`, nomor account pertama `1008`, dan nomor account terakhir `1729`.

## Screenshot Hasil Running

Jalankan program di komputer dan ambil screenshot hasil yang sebenarnya. Simpan gambar di folder `screenshots/`, dengan nama:

- `screenshots/CountryCapital.png`
- `screenshots/BankTest.png`
- `screenshots/BankAccountArrayBeraksi.png`

Setelah gambar diunggah, tambahkan tampilan screenshot berikut ke README (pastikan nama file sama):

```markdown
### CountryCapital
![Hasil running CountryCapital](screenshots/CountryCapital.png)

### BankTest
![Hasil running BankTest](screenshots/BankTest.png)

### BankAccountArrayBeraksi
![Hasil running BankAccountArrayBeraksi](screenshots/BankAccountArrayBeraksi.png)
```

## Library Tambahan

Program menggunakan library standar Java, termasuk `java.util.ArrayList` pada latihan ArrayList. Tidak ada library eksternal tambahan yang diperlukan untuk kode yang tercantum di repositori ini.

## Catatan

File `Account.java`, `Customer.java`, `Bank.java`, dan `BankAccount.java` merupakan class pendukung. Jalankan file utama yang memiliki method `main()`, yaitu `CountryCapital.java`, `BankTest.java`, dan `BankAccountArrayBeraksi.java`.
