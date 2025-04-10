package Jobsheet7;

public class MahasiswaBerprestasi13 {
        Mahasiswa13 [] listMhs;
        int idx;
        MahasiswaBerprestasi13(int jumMhs){
            listMhs = new Mahasiswa13[jumMhs];
        }


        void tambah (Mahasiswa13 m){
            if (idx<listMhs.length){ 
                listMhs[idx] = new Mahasiswa13(m.nim,m.nama,m.kelas,m.ipk);
                idx++;
            } else {
                System.out.println("data sudah penuh");
            }
        }
            void tampil(){
                for (Mahasiswa13 m : listMhs) {
                    m.tampilInformasi();
                    System.out.println("-----------------------------");
        }
    }

        void bubbleSort(){
            for (int i = 0; i < listMhs.length-1; i++) {
                for(int j=1; j<listMhs.length-i; j++){
                    if(listMhs[j].ipk>listMhs[j-1].ipk){
                        Mahasiswa13 temp = listMhs[j];
                        listMhs[j] = listMhs[j-1];
                        listMhs[j-1] = temp;
                    }
            }
        }
    }

        void selectionSort(){
            for (int i = 0; i < listMhs.length-1; i++) {
                int idxMin = i;
                for (int j =i+1; j < listMhs.length; j++) {
                    if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                        idxMin=j;
                    }
                }

                Mahasiswa13 temp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = temp;
            }
        }

        void insertionSort(){
            for (int i = 1; i < listMhs.length; i++) {
                Mahasiswa13 temp = listMhs[i];
                int j = i;
                while(j>0 && listMhs[j-1].ipk<temp.ipk){
                    listMhs[j] = listMhs[j-1];
                    j--;
                }
                listMhs[j] = temp;
            }
        }

   

        int findBinarySearch(double cari, int left, int right){
            int mid;
            if (right>=left) {
                mid = (left+right)/2;
                if (cari == listMhs[mid].ipk) {
                    return (mid);
                }
                else if (listMhs[mid].ipk<cari) {
                    return findBinarySearch(cari, left, mid-1);                    
                }else{
                    return findBinarySearch(cari, mid+1, right);
                }
            }
            return -1;
        }

        void tampilPosisi(double x, int pos){
            if (pos!=-1) {
                System.out.println("data mahasiswa dengan IPK : " +x+ "ditemukan pada indeks " +pos);
            }
            else{
                System.out.println("data " +x+ "tidak ditemukan");
            }
        }
        void tampilDataSearch(double x,int pos){
            if (pos !=-1) {
                System.out.println("nim\t : " +listMhs[pos].nim);
                System.out.println("nama\t : " +listMhs[pos].nama);
                System.out.println("kelas\t : " +listMhs[pos].kelas);
                System.out.println("ipk\t : "+x);
            }
            else{
                System.out.println("data mahasiswa dengan ipk " +x+ "tidak ditemukan");
            }
        }

}
 