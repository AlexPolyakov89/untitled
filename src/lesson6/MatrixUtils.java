package lesson6;

public class MatrixUtils {
    public static int [][] fillMatrix(int[][] matrix,int number){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number;

            }
        }


        return matrix;
    }


    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                    System.out.print(matrix[i][j] + " ");


                }
            System.out.println();

            }



    }
    public static void printMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }

    public static int znachenie (int [][] massiv,int indexRow,int indexCol) { //вывести число из массива
        return massiv[indexRow][indexCol];
    }



    }





