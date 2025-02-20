package Jobsheet2;

public class mataKuliahMain13 {
    public static void main(String[] args){
        mataKuliah13 mk1 = new mataKuliah13();
        mk1.kodeMk = "123";
        mk1.nama = "ALSD";
        mk1.sks = 3;
        mk1.jumlahJam = 6;


        mk1.tampilkanInformasi();
        mk1.ubahSKS(5);
        // mk1.tambahJam(4);
        mk1.kurangiJam(7);
        mk1.tampilkanInformasi();

        mataKuliah13 mk2 = new mataKuliah13("121", "PBO", 3, 6);
        mk2.tambahJam(2);
        mk2.kurangiJam(1);
        mk2.ubahSKS(4);
        mk2.tampilkanInformasi();
    
    }
}
