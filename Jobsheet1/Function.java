import java.util.Scanner;
public class Function {
   
    static int[][] jumlBung = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}
    };
    
   
    static int[] harga = {75000, 50000, 60000, 10000};
    
        public static void hitungPendapatan() {
        System.out.println("Pendapatan Tiap Cabang:");
        for (int i = 0; i < jumlBung.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < jumlBung[i].length; j++) {
                pendapatan += jumlBung[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }
    

    public static void tampilkanStok() {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("Stok Bunga Tiap Jenis:");
        for (int i = 0; i < namaBunga.length; i++) {
            int totalStok = 0;
            for (int j = 0; j < jumlBung.length; j++) {
                totalStok += jumlBung[j][i];
            }
            System.out.println(namaBunga[i] + ": " + totalStok);
        }
    }
    
    
    public static void kurangiStok() {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < jumlBung.length; i++) {
            for (int j = 0; j < jumlBung[i].length; j++) {
                jumlBung[i][j] += bungaMati[j];
            }
        }
    }
    
    public static void main(String[] args) {
        hitungPendapatan();
        tampilkanStok();
        System.out.println("Mengurangi stok karena bunga mati...");
        kurangiStok();
        tampilkanStok();
    }
}
