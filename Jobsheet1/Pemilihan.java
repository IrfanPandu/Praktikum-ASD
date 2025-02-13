import java.util.Scanner;
public class Pemilihan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("========================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("========================");
        System.out.println("========================");
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("========================");
            System.out.println("========================");
        } else {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        

       


        String nilaiHuruf;
        if (nilaiAkhir >=80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else {
            nilaiHuruf = "D";
        }

    
        if (nilaiAkhir >= 50 ) {
            System.out.println("Nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("========================");
            System.out.println("========================");
            System.out.println("SELAMAT ANDA LULUS");
        } 
        }

    }
}
