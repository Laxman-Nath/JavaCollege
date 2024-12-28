package fileio2080;

import java.io.*;
import java.util.Scanner;

public class FileIO2080 {

    public static void writeMatrix() throws Exception {
        PrintWriter ps = new PrintWriter(new FileOutputStream("matrix.txt"));

        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {

                ps.print(A[i][j] + " ");
            }
            ps.println();

        }
        ps.close();
    }
    
    public static int [][] readArray() throws FileNotFoundException{
                int A[][] = new int[3][3];
        Scanner sc = new Scanner(new FileInputStream("matrix.txt"));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sc.hasNext()) {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        return A;
    }

    public static void printArray(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(A[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static int getRowSum(int A[][], String label) {
        int rowSum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (label.equalsIgnoreCase("first")) {
                    if (i == 0) {
                        rowSum += A[i][j];
                    }
                } else if (label.equalsIgnoreCase("second")) {
                    if (i == 1) {
                        rowSum += A[i][j];
                    }
                } else {
                    if (i == 2) {
                        rowSum += A[i][j];
                    }
                }

            }

        }
        return rowSum;
    }

    public static int getColumnSum(int A[][], String label) {
        int columnSum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (label.equalsIgnoreCase("first")) {
                    if (j == 0) {
                        columnSum += A[i][j];
                    }
                } else if (label.equalsIgnoreCase("second")) {
                    if (j == 1) {
                        columnSum += A[i][j];
                    }
                } else {
                    if (j == 2) {
                        columnSum += A[i][j];
                    }
                }

            }

        }
        return columnSum;
    }

    public static int getDiagnolSum(int A[][], String label) {
        int diagnolSum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (label.equalsIgnoreCase("left")) {
                    if (i == j) {
                        diagnolSum += A[i][j];
                    }

                } else {
                    if (i == 2 - j) {
                        diagnolSum += A[i][j];

                    }
                }
            }
        }
        return diagnolSum;
    }

    public static void main(String[] args) throws Exception {
        writeMatrix();
        int A[][]=readArray();

        printArray(A);

        int firstRowSum = getRowSum(A, "first");
        int secondRowSum = getRowSum(A, "second");
        int thirdRowSum = getRowSum(A, "third");
        int firstColumnSum = getColumnSum(A, "first");
        int secondColumnSum = getColumnSum(A, "second");
        int thirdColumnSum = getColumnSum(A, "third");
        boolean result = (firstRowSum == secondRowSum) && (firstRowSum == thirdRowSum) && (firstRowSum == firstColumnSum) && (firstRowSum == secondColumnSum) && (firstRowSum == thirdColumnSum) && (firstRowSum == getDiagnolSum(A, "left")) && (firstRowSum == getDiagnolSum(A, "right"));
        if (result) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal...");
        }
    }

}
