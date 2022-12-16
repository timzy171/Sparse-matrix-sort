package org.example;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Matrix {
    public int[][] matrix;

    public Matrix(int rows,int columns) {
        this.matrix = new int[rows][columns];
    }


    public void sort_matrix(){ // Method which sorting matrix
        Arrays.sort(this.matrix,Comparator.comparingInt(arr -> Arrays.stream(arr).sum()));
        for (int i = 0; i < this.matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < this.matrix[i].length; j++) {
                sum += this.matrix[i][j];
            }
            System.out.println(sum);
        }

        System.out.println("Matrix was sorted");
    }

    public static void generateFile(int rows, int columns ,String fileName) throws IOException {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("File was created");
        }

        FileWriter fileWriter = new FileWriter(fileName);


        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < columns / 2; j++) {
                int value = (int) (Math.random() * 100);
                int indexOfI = (int) (Math.random() * rows);
                int indexOfj = (int) (Math.random() * columns);
                fileWriter.write(value + " " + indexOfI + " " + indexOfj + "\n");
            }
        }
        fileWriter.close();
    }

    public  void parseFile(int rows,int columns,String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null){
            String[] buffer = line.split(" ");
            if(this.matrix[Integer.parseInt(buffer[1])][Integer.parseInt(buffer[2])] == 0){
                this.matrix[Integer.parseInt(buffer[1])][Integer.parseInt(buffer[2])] = Integer.parseInt(buffer[0]);
            }
            line = reader.readLine();

        }
        System.out.println("File was parsed");
    }
}
