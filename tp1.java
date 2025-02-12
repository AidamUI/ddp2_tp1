import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class tp1 {

    // Deklarasi variable awal yang berlaku untuk semua method dalam class
    static Scanner input = new Scanner(System.in);
    static int stok;
    static double hargaBarang, saldo;

    public static void main(String[] args) {


        System.out.println("=============================================================\n" +
                "____ _ _____ _ _\n" +
                "| _ \\ | | | __ \\ | (_)\n" +
                "| |_) |_ _ _ __| |__ __ _ _ __ | |__) |__ __| |_ __ _\n" +
                "| _ <| | | | '__| '_ \\ / _` | '_ \\| ___/ _ \\/ _` | |/ _` |\n" +
                "| |_) | |_| | | | | | | (_| | | | | | | __/ (_| | | (_| |\n" +
                "|____/ \\__,_|_| |_| |_|\\__,_|_| |_|_| \\___|\\__,_|_|\\__,_|\n" +
                "=============================================================\n" +
                "============== Selamat datang di Burhanpedia! ===============\n" +
                "=============================================================\n");

        // Meminta input kepada user untuk nilai awal stok, harga, dan saldo
        boolean memintaInput = true;
        while (memintaInput) {
            System.out.print("Masukkan stok awal: ");
            stok = input.nextInt();
            System.out.print("Masukkan harga barang: ");
            hargaBarang = input.nextDouble();
            System.out.print("Masukkan saldo awal: ");
            saldo = input.nextDouble();

            // Validasi stok, harga barang, dan saldo tidak negatif
            if(stok>0 && hargaBarang>0 && saldo>0) {
                memintaInput = false;
            } else {
                System.out.println("stok, harga barang, dan saldo awal harus positif, silahkan mengisi lagi!");
            }
        }

        // Menu utama
        boolean burhanpedia = true;
        while (burhanpedia) {
            System.out.println("\n" +
                    "Pilih menu\n" +
                    "1. Penjual\n" +
                    "2. Pembeli\n" +
                    "3. Hari Selanjutnya\n" +
                    "4. Keluar\n");

            // Penerapan switch case untuk memproses input user
            System.out.print("Perintah: ");
            int perintah = input.nextInt();
            switch (perintah) {
                case 1: menuPenjual(); break;

                case 2: menuPembeli(); break;

                case 3: tanggalBesok(); break;

                case 4: burhanpedia = false; break;


            }

        }

    }

    // ================================================= METHOD PENJUAL =================================================
    static void menuPenjual() {
        boolean diMenuPenjual = true;
        while (diMenuPenjual) {
            System.out.println(
                    "===== MENU PENJUAL =====\n" +
                            "1. Cek Stok\n" +
                            "2. Cek Harga Barang\n" +
                            "3. Tambah Stok\n" +
                            "4. Ubah Harga Barang\n" +
                            "5. Generate Voucher\n" +
                            "6. Kirim Barang\n" +
                            "7. Lihat Laporan Pendapatan\n" +
                            "8. Kembali ke menu utama\n");

            System.out.print("Perintah: ");
            int pilihanPenjual = input.nextInt();
            switch (pilihanPenjual) {
                case 1: cekStok(); break;

                case 2: cekHargabarang(); break;

                case 3: tambahStok(); break;

                case 4: ubahHargaBarang(); break;

                case 8: diMenuPenjual = false; break;

            }
        }
    }

    static void cekStok(){
        System.out.println("==============================\n" +
                "Stok saat ini: " + stok + "\n==============================");
    }
    static void cekHargabarang(){
        System.out.println("==============================\n" +
                "Harga barang saat ini: " + hargaBarang + "\n==============================");
    }
    static void tambahStok(){

        System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
        int stokTambah = input.nextInt();
        stok += stokTambah;
        System.out.println("Stok berhasil ditambah! Stok saat ini: " + stok);

//        return stok;
    }
    static void ubahHargaBarang(){

        System.out.print("Masukkan jumlah harga barang yang baru: ");
        hargaBarang = input.nextDouble();
        System.out.println("Harga barang diperbarui: " + hargaBarang);

//        return hargaBarang;
    }

    // ================================================= METHOD PEMBELI =================================================
    static void menuPembeli(){
        boolean diMenuPembeli = true;
        while (diMenuPembeli) {
            System.out.println(
                    "===== MENU PEMBELI =====\n" +
                            "1. Cek Saldo\n" +
                            "2. Top Up Saldo\n" +
                            "3. Cek Harga Barang\n" +
                            "4. Beli Barang\n" +
                            "5. Generate Voucher\n" +
                            "6. Lacak Barang\n" +
                            "7. Lihat Laporan Pengeluaran\n" +
                            "8. Kembali ke menu utama");

            System.out.print("Perintah: ");
            int pilihanPembeli = input.nextInt();
            switch (pilihanPembeli) {
                case 1: cekSaldo(); break;

                case 2: tambahSaldo(); break;

                case 3: cekHargabarang(); break;

                case 8: diMenuPembeli = false; break;
            }
        }
    }

    static void cekSaldo(){
        System.out.println("==============================\n" +
                "Saldo saat ini: " + saldo + "\n==============================");
    }
    static void tambahSaldo(){

        System.out.print("Masukkan jumlah saldo yang ingin ditambah: ");
        int saldoTambah = input.nextInt();
        saldo += saldoTambah;
        System.out.println("Saldo berhasil ditambah! Saldo saat ini: " + saldo);
    }

    // ================================================= OTHER METHODS =================================================
    static void tanggalBesok() {
        LocalDate tomorrowDate = LocalDate.now().plusDays(1);
        System.out.println("Tanggal: " + tomorrowDate.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID")) + ", "
                + tomorrowDate.getDayOfMonth() + " "
                + tomorrowDate.getMonth().getDisplayName(TextStyle.FULL, new Locale("id", "ID")) + " "
                + tomorrowDate.getYear());
        // print tomorrow date bro, Tanggal: Minggu 2 Februari 2025
    }
}