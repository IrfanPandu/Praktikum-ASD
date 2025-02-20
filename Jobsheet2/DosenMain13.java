package Jobsheet2;

public class DosenMain13 {
    public static void main(String[] args) {

        Dosen13 ds1 = new Dosen13();
            ds1.idDosen = "09876";
            ds1.nama = "Dosen 1";
            ds1.statusAktif = true;
            ds1.tahunBergabung = 2015;
            ds1.bidangKeahlian = "Matematika";
            
            ds1.tampilkanInformasi();
            ds1.setStatusAktif(true);
            ds1.hitungMasakerja(2025);
            ds1.ubahKeahlian("rpl");
            
            

            Dosen13 ds2 = new Dosen13("1245","Pandu",false,2010,"rpl");
            ds2.tampilkanInformasi();
            ds2.setStatusAktif(false);
            ds2.hitungMasakerja(2030);

        
}
}
