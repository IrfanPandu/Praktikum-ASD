package Jobsheet2;

public class mataKuliah13 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("kode mata kuliah: " + kodeMk);
        System.out.println("nama mata kuliah: " + nama);
        System.out.println("sks mata kuliah: " + sks);
        System.out.println("jumlah jam mata kuliah: " + jumlahJam);
    }

    public mataKuliah13() { 
        
    }    

    public mataKuliah13(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam (int jam){
        if (jumlahJam >= 0 ) {
            jumlahJam += jam; 
        }
    }

   public void kurangiJam(int jam){
        if (jam > jumlahJam) {
            System.out.println("pengurangan tidak dapat dilakukan, karena jumlah jam tersisa hanya: " + jumlahJam);
        }else{
            jumlahJam -= jam;
            System.out.println("pengurangan dapat dilakukan, jumlah jam sekarang: " + jumlahJam);
        }
    }

}
