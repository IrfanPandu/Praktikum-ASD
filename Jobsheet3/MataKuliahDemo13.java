package Jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       

        System.out.println("masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        MataKuliah13[] arrayOfMataKuliah13=new MataKuliah13[jumlahMatkul];

        MataKuliah13.tambahData(arrayOfMataKuliah13);
        MataKuliah13.cetakInfo(arrayOfMataKuliah13);
        input.close();

    }
}
