package Jobsheet5;
import java.util.Scanner;
public class pangkatmain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan elemen: ");
        int elemen = sc.nextInt();

        pangkat13[] png = new pangkat13[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan pangkat elemen ke-"+(i+1)+": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat13(basis, pangkat);
        }

        System.out.println("Hasil Pangkat bruteforce: ");
        for (pangkat13 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+" = "+p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("Hasil Pangkat divide and conquer: ");
        for (pangkat13 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+" = "+p.pangkatDC(p.nilai, p.pangkat));
        }

    }
}
