public class Surat13{
    String idSurat,namaMahasiswa,kelas;
    char jenisIzin;
    int durasi;
    boolean statusCek;

    Surat13
    () {
    }

    Surat13
    (String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.statusCek = false;
    }

    void suratDicek() {
        this.statusCek = true;
    }
}