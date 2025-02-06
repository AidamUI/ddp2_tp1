import java.util.Scanner;

public class tp1{
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

        System.out.print("Masukkan stok awal: "); int stokAwal = input.nextInt();
        System.out.print("Masukkan harga barang: "); int hargaBarang = input.nextInt();
        System.out.print("Masukkan saldo awal: "); int saldoAwal = input.nextInt();

        System.out.println("\n" +
                "Pilih menu\n" +
                "1. Penjual\n" +
                "2. Pembeli\n" +
                "3. Hari Selanjutnya\n" +
                "4. Keluar\n");

        System.out.print("Perintah: "); int perintah = input.nextInt();
        switch (perintah) {
            case 1: System.out.println(
                    "===== MENU PENJUAL =====\n" +
                    "1. Cek Stok\n" +
                    "2. Cek Harga Barang\n" +
                    "3. Tambah Stok\n" +
                    "4. Ubah Harga Barang\n" +
                    "5. Generate Voucher\n" +
                    "6. Kirim Barang\n" +
                    "7. Lihat Laporan Pendapatan\n" +
                    "8. Kembali ke menu utama\n");
            break;

            case 2: System.out.println(
                    "===== MENU PEMBELI =====\n" +
                    "1. Cek Saldo\n" +
                    "2. Top Up Saldo\n" +
                    "3. Cek Harga Barang\n" +
                    "4. Beli Barang\n" +
                    "5. Generate Voucher\n" +
                    "6. Lacak Barang\n" +
                    "7. Lihat Laporan Pengeluaran\n" +
                    "8. Kembali ke menu utama");
            break;

            case 3: System.out.println("Tanggal: hari, tanggal bulan tahun");
            // print tomorrow date bro, Tanggal: Minggu 2 Februari 2025
                break;

            case 4: System.out.println();


        }

    }
}