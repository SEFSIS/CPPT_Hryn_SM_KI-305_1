import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Програма для створення квадратної матриці і збереження її у файлі.
 */
public class Lab1HrynKI305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запит на введення розміру матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        int n = scanner.nextInt();

        String filler;
        do {
            // Запит на введення символу-заповнювача
            System.out.print("Введіть символ-заповнювач (символ довжиною 1): ");
            filler = scanner.next();
            if (filler.length() != 1) {
                System.out.println("Символ-заповнювач має бути лише одним символом.");
            }
        } while (filler.length() != 1);
        char fillerChar = filler.charAt(0);

        // Створення та заповнення матриці
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j && i + j >= n - 1 || i <= j && i + j <= n - 1) {
                    matrix[i][j] = fillerChar;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        try {
            // Запис матриці у файл
            FileWriter writer = new FileWriter("matrix.txt");
            PrintWriter printWriter = new PrintWriter(writer);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.print(matrix[i][j] + " ");
                    System.out.print(matrix[i][j] + " ");
                }
                printWriter.println();
                System.out.println();
            }

            printWriter.close();
            System.out.println("Матриця збережена у файлі 'matrix.txt'.");
        } catch (IOException e) {
            // Обробка помилок при збереженні матриці у файлі
            System.err.println("Помилка при збереженні матриці у файлі.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
