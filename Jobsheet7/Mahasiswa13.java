package Jobsheet7;

import java.util.Scanner;

public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa13(){

    }

    Mahasiswa13(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
    void tambahData(Scanner inp){
        System.out.print("masukkan nim: ");
        nim = inp.nextLine();
        System.out.print("masukkan nama: ");
        nama = inp.nextLine();
        System.out.print("masukkan kelas: ");
        kelas = inp.nextLine();
        System.out.print("masukkan ipk: ");
        ipk = inp.nextDouble();
        inp.nextLine();
        System.out.println("-------------------");
    }
   
    }


