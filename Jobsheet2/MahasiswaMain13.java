package Jobsheet2;
 
public class MahasiswaMain13 {

    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13();
        mhs1.nama = "Muhammad Ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
    
    
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

    
        Mahasiswa13 mhs2 = new Mahasiswa13("Anisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa13 mhs3 = new Mahasiswa13("Irfan Pandu Pratama","244107020193",3.80,"TI 1E");
        mhs3.updateIPK(3.90);
        mhs3.tampilkanInformasi();
      

    }
}
    
