package Jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        Scanner inp = new Scanner(System.in);
        Mahasiswa13 mhs = new Mahasiswa13();
        int jumMhs =5;

       for (int i = 0; i < jumMhs; i++) {
        System.out.println("masukkan data mahasiswa ke-"  +(i+1)+" ");
        mhs.tambahData(inp);
        list.tambah(mhs);
       }
        
        list.tampil();
        System.out.println("------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        Double cari = inp.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("-----------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------------------");
       double posisi2 = list.findBinarySearch(cari,0, jumMhs-1);
       int pss2 = (int)posisi2;
       list.tampilPosisi(cari, pss2);
       list.tampilDataSearch(cari, pss2);
    }   
} 
