package Soal3While;
import java.util.Scanner;

public class Soal3While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata dalam camelCase: ");
        String input = scanner.next();

        // Menghitung jumlah kata, dimulai dari 1
        int wordCount = 1;
        int i = 0;


        // Selama indeks masih dalam jangkauan panjang string
        while (i < input.length()) {
            char c = input.charAt(i);
            // Jika ada huruf besar, hitung sebagai kata baru
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
            i++; // Increment indeks
        }

        // Output jumlah kata
        System.out.println("Jumlah kata dalam camelCase : " + wordCount);
        scanner.close();
    }
}