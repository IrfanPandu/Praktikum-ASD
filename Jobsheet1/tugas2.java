import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        do {
         
            System.out.println("\n=== MENU PERHITUNGAN KUBUS ===");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilih = sc.nextInt();
            
            if (pilih >= 1 && pilih <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = sc.nextDouble();

                switch (pilih) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                        break;
                }
            } else if (pilih != 4) {
                System.out.println("pilih tidak valid. Silakan coba lagi.");
            }

        } while (pilih != 4);
        
        System.out.println("Program selesai.");
        sc.close();
    }

    
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}

