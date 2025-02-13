import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
       
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[] KOTA = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kodePlat plat nomor: ");
        char inputkodePlat = sc.next().toUpperCase().charAt(0); 

        boolean ditemukan = false;
        for (int i = 0; i < kodePlat.length; i++) {
            if (kodePlat[i] == inputkodePlat) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("kodePlat plat tidak ditemukan.");
        }

        sc.close();
    }
}