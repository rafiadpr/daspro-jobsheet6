import java.util.Scanner;

public class Pemilihan2Percobaan223 {

    public static void main(String[] args) {

        Scanner input23 = new Scanner(System.in);

        int pilihan_menu;
        String member, metode_pembayaran;
        double diskon, total_bayar, harga, potongan_qris = 1000;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice)");
        System.out.println("----------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input23.nextInt();
        input23.nextLine();
        
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input23.nextLine();
        System.out.println("----------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        // Meminta input jenis pembayaran
        System.out.print("Metode pembayaran Cash/QRIS (y/n) ? = ");
        metode_pembayaran = input23.nextLine();
        if (metode_pembayaran.equalsIgnoreCase("y")) {
            total_bayar -= potongan_qris;
            System.out.println("Potongan QRIS sebesar Rp. 1.000 telah diterapkan.");
        } else if (metode_pembayaran.equalsIgnoreCase("n")) {
            System.out.println("Tidak ada potongan QRIS.");
        } else {
            System.out.println("Input metode pembayaran tidak valid.");
            return;
        }

        System.out.println("Total bayar akhir = " + total_bayar);
        System.out.println("----------------------------------");
    }
}
