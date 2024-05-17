import java.util.Scanner;
import utsmilan.Utsmilan;

/**
 * Author: 2201010526_Milan Cantik
 */
public class KosApp {
    private static final int MAX_RECORDS = 100;
    private Utsmilan[] records;
    private int numOfRecords;
    private Scanner scanner;

    public KosApp() {
        records = new Utsmilan[MAX_RECORDS];
        numOfRecords = 0;
        scanner = new Scanner(System.in);
    }

    public void tambahRecord() {
        if (numOfRecords < MAX_RECORDS) {
            System.out.println("Masukkan data penyewa:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat Email: ");
            String email = scanner.nextLine();
            System.out.print("Nomor Telepon: ");
            String telepon = scanner.nextLine();
            System.out.print("Nomor Kamar: ");
            String kamar = scanner.nextLine();
            System.out.print("Durasi Penyewaan (hari): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            records[numOfRecords++] = new Utsmilan(nama, email, telepon, kamar, durasi);
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Batas maksimal data sudah tercapai.");
        }
    }

    public void ubahRecord() {
        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (nomor >= 1 && nomor <= numOfRecords) {
            System.out.println("Masukkan data baru:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat Email: ");
            String email = scanner.nextLine();
            System.out.print("Nomor Telepon: ");
            String telepon = scanner.nextLine();
            System.out.print("Nomor Kamar: ");
            String kamar = scanner.nextLine();
            System.out.print("Durasi Penyewaan (hari): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            records[nomor - 1].setNamaPenyewa(nama);
            records[nomor - 1].setAlamatEmail(email);
            records[nomor - 1].setTeleponPenyewa(telepon);
            records[nomor - 1].setNomorKamar(kamar);
            records[nomor - 1].setDurasiMenyewa(durasi);

            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public void hapusRecord() {
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (nomor >= 1 && nomor <= numOfRecords) {
            for (int i = nomor - 1; i < numOfRecords - 1; i++) {
                records[i] = records[i + 1];
            }
            records[numOfRecords - 1] = null; // Clear the last record
            numOfRecords--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public void tampilkanRecord() {
        System.out.println("Daftar Data Penyewa Kos:");
        for (int i = 0; i < numOfRecords; i++) {
            System.out.println("Data " + (i + 1) + ":");
            System.out.println(records[i].toString());
            System.out.println();
        }
    }

    public void jalankan() {
        int pilihan;

        do {
            System.out.println("Menu Aplikasi:");
            System.out.println("1. Tambah Data Penyewa");
            System.out.println("2. Tampilkan Data Penyewa");
            System.out.println("3. Ubah Data Penyewa");
            System.out.println("4. Hapus Data Penyewa");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    tambahRecord();
                    break;
                case 2:
                    tampilkanRecord();
                    break;
                case 3:
                    ubahRecord();
                    break;
                case 4:
                    hapusRecord();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void main(String[] args) {
        KosApp rentalApp = new KosApp();
        rentalApp.jalankan();
    }
}
