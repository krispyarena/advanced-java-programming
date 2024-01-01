package matrices;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter rows and columns of matrix 1 : ");

        int r1 = scanner.nextInt();

        int c1 = scanner.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        m1.setElement();

        System.out.println("Matrix 1: ");
        printMatrix(m1);

        System.out.println("Enter rows and columns of matrix 2 : ");

        int r2 = scanner.nextInt();

        int c2 = scanner.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        m2.setElement();

        System.out.println("Matrix 2 : ");
        printMatrix(m2);

        Matrix sum = m1.addMatrix(m2);
        if (sum!= null){
            System.out.println("Sum of Matrices : ");
            printMatrix(sum);
        }

        Matrix mul = m1.mulMatrix(m2);
        if(mul != null){
            System.out.println("Product of matrices: ");
            printMatrix(mul);
        }

        scanner.close();
    }

    static void printMatrix(Matrix m){
        for(int i = 0; i<m.getRows(); i++){
            for(int j = 0; j<m.getColumns(); j++){
                System.out.printf("%d\t", m.matrix[i][j]);
            }
            System.out.println();
        }
    }
}
