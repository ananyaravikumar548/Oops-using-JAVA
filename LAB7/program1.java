import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of matrix : ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int sumDiagonal = 0;
        int sumUpper = 0;
        int sumLower = 0;
        
   
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumDiagonal += matrix[i][j]; 
                } else if (i < j) {
                    sumUpper += matrix[i][j];   
                } else {
                    sumLower += matrix[i][j];   
                }
            }
        }
        
        System.out.println("\nSum of Diagonal elements: " + sumDiagonal);
        System.out.println("Sum of Upper Diagonal elements: " + sumUpper);
        System.out.println("Sum of Lower Diagonal elements: " + sumLower);
        
        sc.close(); 
    }
}

