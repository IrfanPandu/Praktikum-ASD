package Jobsheet7;

import java.util.ArrayList;

public class dataDosen13 {
    Dosen13 [] dataDosen13 = new Dosen13[10];
    int idx;

    void tambah(Dosen13 dsn){  
        if (idx < dataDosen13.length) {
            dataDosen13[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen13[i].tampil();
        }
    }

    void sortingAsc() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen13[j].usia > dataDosen13[j + 1].usia) {
                    Dosen13 temp = dataDosen13[j];
                    dataDosen13[j] = dataDosen13[j + 1];
                    dataDosen13[j + 1] = temp;
                }
            }
        }
    }
    void sortingDesc() { 
        for (int i = 1; i < idx; i++) {
            Dosen13 temp = dataDosen13[i];
            int j = i;
            while (j > 0 && dataDosen13[j - 1].usia < temp.usia) {
                dataDosen13[j] = dataDosen13[j - 1];
                j--;
            }
            dataDosen13[j] = temp;
        }
    }
    void pencarianDataSequential13(String cariNama){
        int cari = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen13[i].nama.equalsIgnoreCase(cariNama)) {
                dataDosen13[i].tampil();
                cari++;
            }
        }
        if (cari == 0) {
            System.out.println("dosen dengan nama " + cariNama + " tidak ditemukan");
            }else if (cari > 1) {
                System.out.println("ditemukan lebih dari satu data dosen dengan nama yang sama!");
            }
        }
    
    void pencarianDataBinary(int cariUsia){

        int awal = 0, akhir = idx -1, tengah = -1;
        boolean ditemukan = false;

        while (awal <= akhir) {
            tengah = (awal + akhir) / 2;
            if (dataDosen13[tengah].usia == cariUsia) {
                ditemukan = true;
                break;
            }
            if (dataDosen13[tengah].usia < cariUsia) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
         if (!ditemukan) {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan");
            return;
         }       

         int kiri = tengah, kanan = tengah;
         while (kiri >= 0 && dataDosen13[kiri].usia == cariUsia) kiri--; {
         while (kanan < idx && dataDosen13[kanan].usia == cariUsia)kanan++; {
            System.out.println("hasil pencarian dosen dengan usia " + cariUsia+": ");

        for (int i = kiri + 1; i < kanan; i++) {
            dataDosen13[i].tampil();
        }
        if (kanan - kiri - 1 > 1) {
            System.out.println("Peringatan! ada lebih dari 1 dosen dengan usia yang sama");
        }
         }   

         }
    }
}
   
