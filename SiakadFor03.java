import java.util.Locale;
import java.util.Scanner;

public class SiakadFor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int jumlahMahasiswa = 10;
        int lulus = 0;
        int tidakLulus = 0;

         System.out.println("Masukkan nilai untuk " + jumlahMahasiswa + " mahasiswa:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, anggap 0 dan lanjutkan.");
            }

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
             if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah  = " + terendah);
        System.out.println("Jumlah lulus    = " + lulus);
        System.out.println("Jumlah tidak lulus = " + tidakLulus);
        
        sc.close();
    }
}
