package Jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Mahasiswa13 mhs = new Mahasiswa13();
        System.out.print("masukkan jumlah data mahasiswa: ");
        int jumMhs=inp.nextInt();
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13(jumMhs);
        inp.nextLine();
        
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



        System.out.println("-----------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------------------");
        list.insertionSort();
       double posisi2 = list.findBinarySearch(cari,0, jumMhs-1);
       int pss2 = (int)posisi2;
       list.tampilPosisi(cari, pss2);
       list.tampilDataSearch(cari, pss2);
    }   
} 
