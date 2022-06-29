package com.tugas;
import java.util.Scanner;

public class travel {

    Scanner input = new Scanner(System.in);
    int pembayaran, kembali;
    String inputan;

    void paketTraveltoBandung(){
        System.out.println("\n---------------Menu Transaksi Tiket ke Bandung--------------");
        System.out.println("Anda memilih Paket Travel ke Bandung, dengan harga Rp. 100.000,-");
        System.out.print("Silahkan masukkan pembayaran anda: Rp. ");
        pembayaran = input.nextInt();
        kembali = pembayaran - 100000;
        System.out.println("Kembalian anda: Rp. " + kembali);
        System.out.println("--------Terimaksih Sudah Berbelanja di Visiting Travel-------");
    }

    void paketTraveltoCirebon(){
        System.out.println("\n---------------Menu Transaksi Tiket ke Cirebon--------------");
        System.out.println("Anda memilih Paket Travel ke Cirebon, dengan harga Rp. 175.000,-");
        System.out.print("Silahkan masukkan pembayaran anda: Rp. ");
        pembayaran = input.nextInt();
        kembali = pembayaran - 175000;
        System.out.println("Kembalian anda: Rp. " + kembali);
        System.out.println("--------Terimaksih Sudah Berbelanja di Visiting Travel-------");
    }

    void paketTraveltoYogyakarta(){
        System.out.println("\n---------------Menu Transaksi Tiket ke Yogyakarta--------------");
        System.out.println("Anda memilih Paket Travel ke Yogyakarta, dengan harga Rp. 320.000,-");
        System.out.print("Silahkan masukkan pembayaran anda: Rp. ");
        pembayaran = input.nextInt();
        kembali = pembayaran - 320000;
        System.out.println("Kembalian anda: Rp. " + kembali);
        System.out.println("--------Terimaksih Sudah Berbelanja di Visiting Travel-------");
    }

    void paketTraveltoSurabaya(){
        System.out.println("\n---------------Menu Transaksi Tiket ke Surabaya--------------");
        System.out.println("Anda memilih Paket Travel ke Surabaya, dengan harga Rp. 475.000,-");
        System.out.print("Silahkan masukkan pembayaran anda: Rp. ");
        pembayaran = input.nextInt();
        kembali = pembayaran - 475000;
        System.out.println("Kembalian anda: Rp. " + kembali);
        System.out.println("--------Terimaksih Sudah Berbelanja di Visiting Travel-------");
    }

    void transaksi(){
        System.out.println("\n============================================================");
        System.out.println("==============Selamat Datang di Visiting Travel=============");
        System.out.println("============================================================\n");

        System.out.println("------------------------------------------------------------");
        System.out.println(" No |   Rute Asal  |     Rute Tujuan    |       Harga      |");
        System.out.println(" 1. |   Serang     |     Bandung        |   Rp. 100.000,-  |");
        System.out.println(" 2. |   Serang     |     Cirebon        |   Rp. 175.000,-  |");
        System.out.println(" 3. |   Serang     |     Yogyakarta     |   Rp. 320.000,-  |");
        System.out.println(" 4. |   Serang     |     Surabaya       |   Rp. 475.000,-  |");
        System.out.println("------------------------------------------------------------");
        System.out.print("Ke Kota mana anda ingin pergi?: ");
        inputan = input.nextLine();

        switch (inputan){
            case"Bandung":
                paketTraveltoBandung();
                break;
            case "Cirebon":
                paketTraveltoCirebon();
                break;
            case "Yogyakarta":
                paketTraveltoYogyakarta();
                break;
            case "Surabaya":
                paketTraveltoSurabaya();
                break;
            default:
                System.out.println("Maaf inputan yang anda masukkan salah!");
        }
    }

    public static void main(String[] args) {
        travel objek = new travel();
        objek.transaksi();
    }
}
