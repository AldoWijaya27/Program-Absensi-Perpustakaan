package com.company;
import java.lang.String;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Pengunjung {
    String nama, usia, jenisKelamin, pekerjaan;

    Pengunjung (String nama, String usia, String jenisKelamin, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
    }
    void absenPengunjung (){
        Scanner pengunjung = new Scanner(System.in);
        System.out.print("Nama lengkap : ");
        nama = pengunjung.next();
        System.out.print("Usia : ");
        usia = pengunjung.next();
        System.out.print("Jenis kelamin : ");
        jenisKelamin = pengunjung.next();
        System.out.print("Pekerjaan : ");
        pekerjaan = pengunjung.next ();
        hasil();
    }

    void hasil(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Anda Berhasil Mengisi Absensi!");
        System.out.print("Waktu absensi: ");
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm");
        String formattedDate = localDate.format(dateFormatter);
        System.out.println(formattedDate);
        System.out.println("Nama          : " + nama);
        System.out.println("Usia          : " + usia);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Pekerjaan     : " + pekerjaan);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

class Karyawan {
    String nama;
    String nomor;
    String jabatan;
    String usia;

    Karyawan(String nama, String nomor, String jabatan, String usia){
        this.nama = nama;
        this.nomor = nomor;
        this.jabatan = jabatan;
        this.usia = usia;
    }

    void absenKaryawan() {
        Scanner absenKaryawan = new Scanner(System.in);
        System.out.print("Nomor identitas karyawan : ");
        String inputNomor = absenKaryawan.next();
        if (inputNomor.equals(this.nomor)) {
            System.out.println("Selamat Anda berhasil mengisi absensi!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            hasilKaryawan();

        } else {
            System.out.println("Maaff, nomor identitas yang Anda masukan salah");
        }
    }
     void hasilKaryawan(){
         System.out.println("Waktu absensi: ");
         LocalDateTime localDate = LocalDateTime.now();
         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm");
         String formattedDate = localDate.format(dateFormatter);
         System.out.println(formattedDate);
         System.out.println("Nama            : " + nama);
         System.out.println("Nomor identitas : " + nomor);
         System.out.println("Jabatan         : " + jabatan);
         System.out.println("Usia            : " + usia);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     }
}

public class Main {
    public static void main(String[] args) {
        Karyawan Aldo = new Karyawan("Aldo Wijaya", "1234", "Kepala Perpustakaan", "25 tahun");
        Pengunjung orang = new Pengunjung("Aldo", "21", "laki", "pns");

	int fitur;
        Scanner pengguna = new Scanner(System.in);
        System.out.println("ABSENSI PENGUNJUNG DAN KARYAWAN PERPUSTAKAAN");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Silahkan isi sesuai dengan status Anda.");
        System.out.println("1. Pengunjung perpustakaan");
        System.out.println("2. Karyawan perpustakaan");
        System.out.print("Jawaban : ");
        fitur = pengguna.nextInt();

        switch (fitur) {
            case 1:
                //gw pgn jalaninin methodnya absenPengunjung disini han
                orang.absenPengunjung();
                break;

            case 2:
                Aldo.absenKaryawan();
                break;

            default:
                System.out.println("Masukan yang Anda pilih salah!");
        }
    }
}
