package Jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MataKuliah13[] arrayOfMataKuliah13 = new MataKuliah13[3]; 

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode Mata Kuliah: ");
            kode = input.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            nama = input.nextLine();
            System.out.print("SKS Mata Kuliah: ");
            sks = input.nextInt();
            System.out.print("Jumlah Jam Mata Kuliah: ");
            jumlahJam = input.nextInt();
            input.nextLine(); 

            arrayOfMataKuliah13[i] = new MataKuliah13(kode, nama, sks, jumlahJam);
            System.out.println("----------------------------");
        }

        
        System.out.println("\nData Mata Kuliah yang Telah Dimasukkan:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfMataKuliah13[i].kode);
            System.out.println("Nama: " + arrayOfMataKuliah13[i].nama);
            System.out.println("SKS: " + arrayOfMataKuliah13[i].sks);
            System.out.println("Jumlah Jam: " + arrayOfMataKuliah13[i].jumlahJam);
            System.out.println("----------------------------");
        }

        input.close(); 
    }
}



