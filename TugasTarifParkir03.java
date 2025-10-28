import java.util.Scanner;

public class TugasTarifParkir03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        final int tarifMaks = 12500;

        System.out.println("===================================");
        System.out.println("       PEMBAYARAN TARIF PARKIR     ");
        System.out.println("===================================\n");

        while (true) {
            // Input durasi parkir
            System.out.print("Masukkan durasi parkir (jam) [0 untuk selesai]: ");
            int durasi = sc.nextInt();

            if (durasi == 0) {
                System.out.println("\n===================================");
                System.out.println("  Transaksi selesai. Terima kasih! ");
                System.out.println("===================================");
                break;
            }

            if (durasi < 0) {
                System.out.println("Durasi tidak valid (tidak boleh negatif). Coba lagi.\n");
                continue;
            }

            // Input tipe kendaraan langsung
            System.out.print("Tipe kendaraan (1=Mobil, 2=Motor): ");
            int tipe = sc.nextInt();

            if (tipe != 1 && tipe != 2) {
                System.out.println("Tipe kendaraan tidak valid. Coba lagi.\n");
                continue;
            }

            // Hitung total bayar
            int total;
            if (durasi > 5) {
                total = tarifMaks;
            } else {
                total = (tipe == 1) ? durasi * tarifMobil : durasi * tarifMotor;
            }

            String jenis = (tipe == 1) ? "Mobil" : "Motor";

            // Tampilkan hasil seperti struk pembayaran
            System.out.println("\n----------- STRUK PEMBAYARAN -----------");
            System.out.println("Durasi Parkir      : " + durasi + " jam");
            System.out.println("Jenis Kendaraan    : " + jenis);
            System.out.println("Total Bayar        : Rp " + total);
            System.out.println("----------------------------------------\n");
        }

        sc.close();
    }
}
