import java.util.Scanner;
import java.time.LocalDate;


public class tp1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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

        System.out.print("Masukkan stok awal: ");
        int stok = input.nextInt();
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();
        System.out.print("Masukkan saldo awal: ");
        double saldo = input.nextDouble();

        boolean burhanpedia = true;
        while (burhanpedia) {
            System.out.println("\n" +
                    "Pilih menu\n" +
                    "1. Penjual\n" +
                    "2. Pembeli\n" +
                    "3. Hari Selanjutnya\n" +
                    "4. Keluar\n");

            System.out.print("Perintah: ");
            int perintah = input.nextInt();
            switch (perintah) {
                case 1: boolean diMenuPenjual = true;
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
                        case 1: cekStok(stok); break;

                        case 2: cekHargabarang(hargaBarang); break;

                        case 3: stok = tambahStok(stok); break;

                        case 4: hargaBarang = ubahHargaBarang(hargaBarang); break;

                        case 8: diMenuPenjual = false; break;

                    }
                }
                    break;

                case 2: boolean diMenuPembeli = true;
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
                        case 1: cekSaldo(saldo); break;

                        case 2: saldo = tambahSaldo(saldo); break;

                        case 3: cekHargabarang(hargaBarang); break;

                        case 8: diMenuPembeli = false; break;
                    }
                }
                break;

                case 3:
                    LocalDate tomorrowDate = LocalDate.now().plusDays(1);
                    System.out.println("Tanggal: " + tomorrowDate.getDayOfWeek() + ", " + tomorrowDate.getDayOfMonth() + " " + tomorrowDate.getMonth() + " " + tomorrowDate.getYear());
                    // print tomorrow date bro, Tanggal: Minggu 2 Februari 2025
                    break;

                case 4:

                    burhanpedia = false;


            }

        }

    }

    // ================================================= METHOD PENJUAL =================================================
    static void cekStok(int stok){
        System.out.println("==============================\n" +
                "Stok saat ini: " + stok + "\n==============================");
    }
    static void cekHargabarang(double hargaBarang){
        System.out.println("==============================\n" +
                "Harga barang saat ini: " + hargaBarang + "\n==============================");
    }
    static int tambahStok(int stok){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
        int stokTambah = input.nextInt();
        stok += stokTambah;
        System.out.println("Stok berhasil ditambah! Stok saat ini: " + stok);

        return stok;
    }
    static double ubahHargaBarang(double hargaBarang){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah harga barang yang baru: ");
        hargaBarang = input.nextDouble();
        System.out.println("Harga barang diperbarui: " + hargaBarang);

        return hargaBarang;
    }

    // ================================================= METHOD PEMBELI =================================================
    static void cekSaldo(double saldo){
        System.out.println("==============================\n" +
                "Saldo saat ini: " + saldo + "\n==============================");
    }
    static double tambahSaldo(double saldo){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah saldo yang ingin ditambah: ");
        int saldoTambah = input.nextInt();
        saldo += saldoTambah;
        System.out.println("Saldo berhasil ditambah! Saldo saat ini: " + saldo);

        return saldo;

    }


}