package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis();
        int rows =  2000; // SIZE OF NATRIX BY ROWS
        int columns = 2000; // SIZE OF NATRIX BY COLUMNS
        Matrix matrix = new Matrix(rows,columns);
        Matrix.generateFile(rows,columns,"matrix.txt");
        matrix.parseFile(rows,columns,"matrix.txt");
        matrix.sort_matrix();
        long usedBytes = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576;
        System.out.println(usedBytes + " mb");
        System.out.println(System.currentTimeMillis() - time + " ms");
    }
}
