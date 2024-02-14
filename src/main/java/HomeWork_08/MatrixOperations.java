package HomeWork_08;
import java.util.Scanner;
public class MatrixOperations {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть N (розмір матриці NxN): ");
            int n = scanner.nextInt();

            int[][] matrix = new int[n][n];

            fillMatrix(matrix, scanner);
            printRowSums(matrix);
            printMainDiagonal(matrix);
        }

        public static void fillMatrix(int[][] matrix, Scanner scanner) {
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("Елемент [%d][%d]: ", i, j);
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        public static void printRowSums(int[][] matrix) {
            System.out.println("Сума елементів в кожному рядку:");
            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
                System.out.println("Рядок " + (i + 1) + ": " + sum);
            }
        }

        public static void printMainDiagonal(int[][] matrix) {
            System.out.println("Елементи головної діагоналі:");
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][i] + " ");
            }
            System.out.println();
        }
    }

