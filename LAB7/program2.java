import java.util.Scanner;

public class MatrixMiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix (n for n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMiddle Element(s):");
        if (n % 2 == 1) {
            int mid = n / 2;
            System.out.println(matrix[mid][mid]);
        } else {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            System.out.println(matrix[mid1][mid1] + " " + matrix[mid1][mid2]);
            System.out.println(matrix[mid2][mid1] + " " + matrix[mid2][mid2]);
        }

        sc.close();
    }
}
