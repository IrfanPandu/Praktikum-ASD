package Jobsheet2;

public class DosenMain13 {
    public static void main(String[] args) {

        Dosen13 ds1 = new Dosen13();
            ds1.idDosen = "09876";
            ds1.nama = "Dosen 1";
            ds1.setStatusAktif(false);
            ds1.tahunBergabung = 2000;
            ds1.bidangKeahlian = "Matematika";

            ds1.hitungMasakerja(2025);
            ds1.ubahKeahlian("rpl");
            ds1.tampilkanInformasi();

        
}
}
