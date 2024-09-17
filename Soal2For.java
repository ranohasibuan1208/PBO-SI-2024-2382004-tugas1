package Soal2For;
import java.util.Scanner;

public class Soal2For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah n: ");
        int n = scanner.nextInt();

        // Loop untuk setiap baris
        for (int i = 1; i <= n; i++) {
            // Loop untuk mencetak spasi
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Loop untuk mencetak simbol #
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
        scanner.close();
    }
}