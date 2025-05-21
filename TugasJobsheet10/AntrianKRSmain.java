import java.util.Scanner;

public class AntrianKRSmain {
    public static void menu() {
        System.out.println("\n=== Menu Sistem Antrian KRS ===");
        System.out.println("1. Tambahkan Mahasiswa ke Antrian");
        System.out.println("2. Proses 2 Mahasiswa");
        System.out.println("3. Periksa Apakah Antrian Kosong");
        System.out.println("4. Periksa Apakah Antrian Penuh");
        System.out.println("5. Lihat Seluruh Antrian");
        System.out.println("6. Lihat 2 Mahasiswa Terdepan");
        System.out.println("7. Lihat Mahasiswa Terakhir");
        System.out.println("8. Jumlah Mahasiswa dalam Antrian");
        System.out.println("9. Jumlah Mahasiswa yang Sudah Diproses");
        System.out.println("10. Jumlah Mahasiswa yang Belum Diproses");
        System.out.println("11. Hapus Semua Antrian");
        System.out.println("0. Keluar");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AntrianKRS[] daftarDPA = new AntrianKRS[3];
        for (int i = 0; i < daftarDPA.length; i++) {
            daftarDPA[i] = new AntrianKRS(30);
        }

        int pilihanMenu;
        int indeksDPA;

        do {
            menu();
            System.out.print("Pilih menu: ");
            pilihanMenu = input.nextInt(); input.nextLine();

            if (pilihanMenu >= 1 && pilihanMenu <= 11) {
                System.out.print("Pilih DPA (1-3): ");
                indeksDPA = input.nextInt() - 1; input.nextLine();

                if (indeksDPA < 0 || indeksDPA >= daftarDPA.length) {
                    System.out.println("Nomor DPA tidak valid!");
                    continue;
                }
            } else {
                indeksDPA = 0;
            }

            switch (pilihanMenu) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = input.nextLine();
                    System.out.print("Nama  : ");
                    String nama = input.nextLine();
                    System.out.print("Prodi : ");
                    String jurusan = input.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input.nextLine();
                    Mahasiswa mahasiswaBaru = new Mahasiswa(nim, nama, jurusan, kelas);
                    daftarDPA[indeksDPA].Enqueue(mahasiswaBaru);
                    break;

                case 2:
                    System.out.println("Memproses 2 Mahasiswa di DPA " + (indeksDPA + 1));
                    daftarDPA[indeksDPA].Dequeue();
                    break;

                case 3:
                    if (daftarDPA[indeksDPA].IsEmpty()) {
                        System.out.println("Antrian DPA " + (indeksDPA + 1) + " kosong.");
                    } else {
                        System.out.println("Antrian DPA " + (indeksDPA + 1) + " tidak kosong.");
                    }
                    break;

                case 4:
                    if (daftarDPA[indeksDPA].IsFull()) {
                        System.out.println("Antrian DPA " + (indeksDPA + 1) + " penuh.");
                    } else {
                        System.out.println("Antrian DPA " + (indeksDPA + 1) + " masih tersedia.");
                    }
                    break;

                case 5:
                    System.out.println("Menampilkan seluruh antrian DPA " + (indeksDPA + 1) + ":");
                    daftarDPA[indeksDPA].print();
                    break;

                case 6:
                    System.out.println("2 Mahasiswa Terdepan DPA " + (indeksDPA + 1) + ":");
                    daftarDPA[indeksDPA].peek();
                    break;

                case 7:
                    System.out.println("Mahasiswa Terakhir DPA " + (indeksDPA + 1) + ":");
                    daftarDPA[indeksDPA].peekRear();
                    break;

                case 8:
                    System.out.println("Jumlah Mahasiswa dalam Antrian DPA " + (indeksDPA + 1) + ": " +
                            daftarDPA[indeksDPA].getSize());
                    break;

                case 9:
                    System.out.println("Jumlah Mahasiswa yang sudah diproses di DPA " + (indeksDPA + 1) + ": " +
                            daftarDPA[indeksDPA].getJumlahProses());
                    break;

                case 10:
                    System.out.println("Jumlah Mahasiswa yang belum diproses di DPA " + (indeksDPA + 1) + ": " +
                            daftarDPA[indeksDPA].getJumlahBelumProses());
                    break;

                case 11:
                    daftarDPA[indeksDPA].clear();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian KRS.");
                    break;

                default:
                    System.out.println("Menu tidak ditemukan.");
            }

        } while (pilihanMenu != 0);

        input.close();
    }
}
