package com.example.TheMatrix;

public class MatrixLogic {
    public static void main(String[] args) {
        int size = 4;

        int MatrixA[][] =
                {{1, 1, 1, 1},
                        {2, 2, 2, 2},
                        {3, 3, 3, 3},
                        {4, 4, 4, 4}};
        System.out.println("\nMatrix MatrixA:");
        Matrix.printMatrix(MatrixA, size, size);

        size = 4;

        int MatrixB[][] =
                {{1, 1, 1, 1},
                        {2, 2, 2, 2},
                        {3, 3, 3, 3},
                        {4, 4, 4, 4}};
        System.out.println("\nMatrix MatrixB");
        Matrix.printMatrix(MatrixB,size,size);

       int MatrixC[][] = Matrix.add(MatrixA, MatrixB, size);
       
        System.out.println("\nResultant Matrix:");
        Matrix.printMatrix(MatrixC, size, size);
    }
}
