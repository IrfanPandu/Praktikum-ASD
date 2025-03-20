package Jobsheet5;
import java.util.Scanner;
public class summain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen: ");
        int elemen = sc.nextInt();


        sum13 sm = new sum13(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Hasil total bruteforce: "+sm.totalBF());
        System.out.println("Hasil total divide and conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
}
}
