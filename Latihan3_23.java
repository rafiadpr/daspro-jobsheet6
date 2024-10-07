
import java.util.Scanner;

public class Latihan3_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan merk (Converse/Sketcher/Nike): ");
        String inputMerk = sc.nextLine();
        System.out.print("Masukkan kategori (Slip On/High Top) (Woman/Man) (Kids/Adult): ");
        String inputKategori = sc.nextLine();
        System.out.print("Masukkan ukuran: ");
        int inputUkuran = sc.nextInt();

        int harga = 0;

        // Proses menentukan harga berdasarkan merk, kategori, dan ukuran
        if (inputMerk.equalsIgnoreCase("Converse")) {
            if (inputKategori.equalsIgnoreCase("Slip On")) {
                if (inputUkuran >= 36 && inputUkuran <= 40) {
                    harga = 800000;
                }
            } else if (inputKategori.equalsIgnoreCase("High Top")) {
                if (inputUkuran >= 40 && inputUkuran <= 44) {
                    harga = 1200000;
                }
            }
        } else if (inputMerk.equalsIgnoreCase("Sketcher")) {
            if (inputKategori.equalsIgnoreCase("Woman")) {
                if (inputUkuran >= 36 && inputUkuran <= 41) {
                    harga = 1000000;
                }
            } else if (inputKategori.equalsIgnoreCase("Man")) {
                if (inputUkuran >= 41 && inputUkuran <= 44) {
                    harga = 1800000;
                }
            }
        } else if (inputMerk.equalsIgnoreCase("Nike")) {
            if (inputKategori.equalsIgnoreCase("Kids")) {
                if (inputUkuran >= 36 && inputUkuran <= 40) {
                    harga = 750000;
                }
            } else if (inputKategori.equalsIgnoreCase("Adult")) {
                if (inputUkuran >= 40 && inputUkuran <= 44) {
                    harga = 1500000;
                }
            }
        }

        // Menampilkan hasil atau pesan error
        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Input tidak valid, periksa kembali merk, kategori, atau ukuran.");
        }
    }
}
