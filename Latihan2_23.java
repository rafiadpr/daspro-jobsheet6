import java.util.Scanner;
public class Latihan2_23 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String jenisBuku = "";
        double diskon = 0;
        int jumlahBuku = 0;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
            } else if (jumlahBuku <= 3) {
                diskon = 0.08;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        System.out.print("Total Diskon : " + diskon);
    }
}
