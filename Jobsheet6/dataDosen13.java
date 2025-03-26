package Jobsheet6;
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
}
