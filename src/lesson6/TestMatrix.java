package lesson6;

public class TestMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        int[][] resultFill = MatrixUtils.fillMatrix(matrix, 7);
        MatrixUtils.printMatrix(resultFill);
        MatrixUtils.printMainDiagonal(resultFill);
        int znachenieVozvrat=MatrixUtils.znachenie(resultFill, 0, 3);
        System.out.println(znachenieVozvrat);
    }
}
