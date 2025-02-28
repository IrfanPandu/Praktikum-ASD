package Jobsheet3;

public class DataDosen13 {
    public static void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("---------------------------");
        System.out.println("Informasi Dosen");
        int counter = 1;
        for (Dosen13 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+ counter);
            System.out.println("Kode            : "+ dosen.kode);
            System.out.println("Nama            : "+ dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin ? "Perempuan" : "Laki-laki"));
            System.out.println("Usia            : "+ dosen.usia);
            System.out.println("---------------------------");
            counter++;  
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPerempuan++;
            } else {
                jumlahLakiLaki++;
            }
        }

        System.out.println("Jumlah Dosen Perempuan : "+ jumlahPerempuan);
        System.out.println("Jumlah Dosen Laki-laki : "+ jumlahLakiLaki);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPerempuan++;
                totalUsiaPerempuan += dosen.usia;
            } else {
                jumlahLakiLaki++;
                totalUsiaLakiLaki += dosen.usia;
            }
        }

        System.out.println("Rerata Usia Dosen Perempuan : "+ (totalUsiaPerempuan / jumlahPerempuan));
        System.out.println("Rerata Usia Dosen Laki-laki : "+ (totalUsiaLakiLaki / jumlahLakiLaki));
    }

    public static void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        Dosen13 dosenTertua = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("Dosen Tertua");
        System.out.println("Kode            : "+ dosenTertua.kode);
        System.out.println("Nama            : "+ dosenTertua.nama);
        System.out.println("Jenis Kelamin   : " + (dosenTertua.jenisKelamin ? "Perempuan" : "Laki-laki"));
        System.out.println("Usia            : "+ dosenTertua.usia);
    }

    public static void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        Dosen13 dosenTermuda = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("Dosen Termuda");
        System.out.println("Kode            : "+ dosenTermuda.kode);
        System.out.println("Nama            : "+ dosenTermuda.nama);
        System.out.println("Jenis Kelamin   : " + (dosenTermuda.jenisKelamin ? "Perempuan" : "Laki-laki"));
        System.out.println("Usia            : "+ dosenTermuda.usia);
    }
}

