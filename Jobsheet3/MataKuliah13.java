package Jobsheet3;

import java.util.Scanner;

public class MataKuliah13 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah13(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
         public MataKuliah13() {
    }
    public static void tambahData(MataKuliah13[] arrayOfMataKuliah13) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        for (int i = 0; i < arrayOfMataKuliah13.length; i++) {
            arrayOfMataKuliah13[i] = new MataKuliah13();

            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            arrayOfMataKuliah13[i].kode = sc.nextLine();
            System.out.print("Nama        : ");
            arrayOfMataKuliah13[i].nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            arrayOfMataKuliah13[i].sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            arrayOfMataKuliah13[i].jumlahJam = Integer.parseInt(dummy);
        }
        sc.close();
    }

    public static void cetakInfo(MataKuliah13[] arrayOfMataKuliah13) {
        System.out.println("---------------------------");
        System.out.println("Informasi Mata Kuliah");
        for (int i = 0; i < arrayOfMataKuliah13.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode        : "+ arrayOfMataKuliah13[i].kode);
            System.out.println("Nama        : "+ arrayOfMataKuliah13[i].nama);
            System.out.println("SKS         : "+ arrayOfMataKuliah13[i].sks);
            System.out.println("Jumlah Jam  : "+ arrayOfMataKuliah13[i].jumlahJam);
            System.out.println("---------------------------");
        }
    }
}

