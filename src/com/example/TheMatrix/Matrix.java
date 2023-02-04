package com.example.TheMatrix;

public class Matrix {
    private int[][] rowsAndColArray = new int[3][3];

    private int colSize;

    private int rowsSize;

    public  Matrix(){

    }
    public Matrix(int rownsAndColArray[][],int colSize,int rowsSize){
        this.rowsAndColArray = rownsAndColArray;
        this.colSize = colSize;
        this.rowsSize = rowsSize;
    }

    public int[][] getRowsAndColArray() {
        return rowsAndColArray;
    }

    public void setRowsAndColArray(int[][] rowsAndColArray) {
        this.rowsAndColArray = rowsAndColArray;
    }

    public int getColSize() {
        return colSize;
    }

    public void setColSize(int colSize) {
        this.colSize = colSize;
    }

    public int getRowsSize() {
        return rowsSize;
    }

    public void setRowsSize(int rowsSize) {
        this.rowsSize = rowsSize;
    }
    static void printMatrix(int rowsAndColArray[][],
                            int colSize,
                            int rowsSize)
    {
        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(rowsAndColArray[i][j] + " ");

            System.out.println();
        }
    }
    static int[][] add(int MatrixA[][], int MatixB[][],int size){
        int i, j;
        int MatrixC[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                MatrixC[i][j] = MatrixA[i][j] + MatixB[i][j];

        return MatrixC;
    }

}

