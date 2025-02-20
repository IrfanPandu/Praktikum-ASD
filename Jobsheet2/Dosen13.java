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

    public Dosen13() {
        
    }

    public Dosen13(String id, String n, boolean s, int t, String b) {
        idDosen = id;
        nama = n;
        statusAktif = s;
        tahunBergabung = t;
        bidangKeahlian = b;

    }

    public void setStatusAktif(boolean status) {
        if (status == true) {
            System.out.println( nama + " aktif");
        } else {
            System.out.println( nama + " tidak aktif");
        }
    }
    
    void hitungMasakerja(int thnSkrg) {
        thnSkrg -= tahunBergabung;
        System.out.println("masa kerja dosen: " + thnSkrg + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("bidang keahlian dosen baru: " + bidangKeahlian);
    }


}
