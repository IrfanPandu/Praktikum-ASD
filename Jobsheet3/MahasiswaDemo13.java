package Jobsheet3;
import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa13[] arrayOfMahasiswa13 = new Mahasiswa13[3];
        String dummy;


        for (int i = 0; i < arrayOfMahasiswa13.length; i++) {
            arrayOfMahasiswa13[i] = new Mahasiswa13();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa13[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa13[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa13[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa13[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------");
            
        }
        Mahasiswa13.cetakInfo(arrayOfMahasiswa13);

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("NIM     : " + arrayOfMahasiswa13[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa13[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa13[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa13[i].ipk);   
            System.out.println("------------------------");
        }

        arrayOfMahasiswa13[0] = new Mahasiswa13();
        arrayOfMahasiswa13[0].nim = "244107060033";
        arrayOfMahasiswa13[0].nama = " AGNES TITANIA KINANTI";
        arrayOfMahasiswa13[0].kelas = "SIB-1E";
        arrayOfMahasiswa13[0].ipk = (float) 3.75;

        arrayOfMahasiswa13[1] = new Mahasiswa13();
        arrayOfMahasiswa13[1].nim = "2341720172";
        arrayOfMahasiswa13[1].nama = " ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa13[1].kelas = "TI-2A";
        arrayOfMahasiswa13[1].ipk = (float) 3.75;

        arrayOfMahasiswa13[2] = new Mahasiswa13();
        arrayOfMahasiswa13[2].nim = "244107023006";
        arrayOfMahasiswa13[2].nama = " DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa13[2].kelas = "TI-2E";
        arrayOfMahasiswa13[2].ipk = (float) 3.80;





        System.out.println("NIM     : " + arrayOfMahasiswa13[0].nim);
        System.out.println("NAMA    : " + arrayOfMahasiswa13[0].nama);
        System.out.println("KELAS   : " + arrayOfMahasiswa13[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa13[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa13[1].nim);
        System.out.println("NAMA    : " + arrayOfMahasiswa13[1].nama);
        System.out.println("KELAS   : " + arrayOfMahasiswa13[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa13[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa13[2].nim);
        System.out.println("NAMA    : " + arrayOfMahasiswa13[2].nama);
        System.out.println("KELAS   : " + arrayOfMahasiswa13[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa13[2].ipk);
        System.out.println("--------------------------------------");




}
}
