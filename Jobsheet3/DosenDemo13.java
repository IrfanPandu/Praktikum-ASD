package Jobsheet3;
import java.util.Scanner;
public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        Dosen13[] arrayOfDosen = new Dosen13[jumlahDosen];
        
        Dosen13.tambahData(arrayOfDosen);
        Dosen13.cetakInfo(arrayOfDosen);
        DataDosen13.dataSemuaDosen(arrayOfDosen);
        DataDosen13.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen13.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen13.infoDosenPalingTua(arrayOfDosen);
        DataDosen13.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}