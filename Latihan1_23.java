import java.util.Scanner;

public class Latihan1_23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int bil1 = 28, bil2 = 54, bil3 = 15, maxbil;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                maxbil = bil1;
            } else {
                maxbil = bil3;
            }
        } else {
            if (bil2 > bil3) {
                maxbil = bil2;
            } else {
                maxbil = bil3;
            }
        }

        System.out.println("bilmax = " + maxbil);
    }
}
