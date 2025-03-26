package Jobsheet6;

public class Dosen13 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen13(){

    }

    Dosen13(String kd, String name,Boolean jk,int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("kode dosen: " +kode);
        System.out.println("nama dosen: " +nama);
        if(jenisKelamin==true){
            System.out.println("jenis kelamin dosen: Perempuan");
        }else{
            System.out.println("jenis kelamin dosen: Laki-laki");
        }
        System.out.println("usia dosen: " +usia);
    } 
}
