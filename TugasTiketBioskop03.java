import java.util.Scanner;

public class TugasTiketBioskop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        System.out.println("======== TIKET BIOSKOP ========");
        System.out.println("Masukkan data pembelian. Ketik 0 untuk selesai.\n");

        while (true) {
            System.out.print("Masukkan nama pembeli: ");
            String nama = sc.nextLine();

            System.out.print("Masukkan jumlah tiket: ");
            int jumlahTiket = sc.nextInt();
            sc.nextLine(); // membersihkan enter

            if (jumlahTiket == 0) {
                break; // keluar dari loop
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif! Diabaikan.\n");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = jumlahTiket * hargaTiket * (1 - diskon);

            System.out.println("\n--- Rincian Pembelian ---");
            System.out.println("Nama Pembeli     : " + nama);
            System.out.println("Jumlah Pembelian : " + jumlahTiket);
            System.out.println("Diskon           : " + (int)(diskon * 100) + "%");
            System.out.println("Jumlah Pembayaran: Rp " + (int)totalBayar);
            System.out.println("--------------------------\n");

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;
        }

        System.out.println("\n=== RINGKASAN PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan    : Rp " + (int)totalPendapatan);

        sc.close();
    }
}
