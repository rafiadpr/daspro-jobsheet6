import java.util.Scanner;

public class Pemilihan2Percobaan123 {

    public static void main(String[] args) {

        Scanner input23 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = input23.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}