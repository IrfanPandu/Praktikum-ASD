package Jobsheet7;
import java.util.Scanner;

public class DosenMain13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataDosen13 dosen = new dataDosen13();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jenis Kelamin (L = true, P = false): ");
                    boolean jk = scanner.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = scanner.nextInt();
                    scanner.nextLine(); 
                    dosen.tambah(new Dosen13(kode, nama, jk, usia));
                    break;
                case 2:
                    dosen.tampil();
                    break;
                case 3:
                    dosen.sortingAsc();
                    System.out.println("Data setelah sorting ASC:");
                    dosen.tampil();
                    break;
                case 4:
                    dosen.sortingDesc();
                    System.out.println("Data setelah sorting DSC:");
                    dosen.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
