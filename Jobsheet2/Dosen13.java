package Jobsheet2;

public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("id dosen: " + idDosen);
        System.out.println("nama dosen: " + nama);
        System.out.println("status dosen: " + statusAktif);
        System.out.println("tahun bergabung dosen: "+ tahunBergabung);
        System.out.println("bidang keahlian dosen: " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        if (status == true) {
            System.out.println("dosen aktif");
        } else {
            System.out.println("dosen tidak aktif");
        }
    }
    
    void hitungMasakerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("masa kerja dosen: " + masaKerja);
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }


}
