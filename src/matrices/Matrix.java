package matrices;

import java.util.Scanner;
class Matrix {

    Scanner scanner = new Scanner(System.in);

    private int rows;
    private int columns;
    int[][] matrix;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public void setElement(){
        System.out.println("Enter elements of a matrix: ");
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++){
                    matrix[i][j] = scanner.nextInt();
                }
            }
    }

    public Matrix addMatrix(Matrix m){

        if (this.rows != m.rows && this.columns != m.columns){
            System.out.println("Matrices not addable");
            return null;
        }
        else{
        
            Matrix result = new Matrix(rows, columns);

            for(int i = 0; i<this.rows; i++){
                for (int j = 0; j <this.columns; j++){
                    result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j]; 
                }
            }
            return result;
            
        }
    }

    public Matrix mulMatrix(Matrix m){
            if(this.columns != m.rows){
                System.out.println("Matrices cant be multiplied");
                return null;
            }
            else{
                Matrix result = new Matrix(rows, columns);

                for (int i = 0; i<rows; i++){
                    for(int j = 0; j<columns; j++){
                        for(int k = 0; k<m.columns; k++){
                            result.matrix[i][j] += this.matrix[i][k] * m.matrix[k][j];  
                        }
                    }

                }
                return result ;
            }
        }
    }