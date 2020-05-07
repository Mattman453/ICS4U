package app;

import java.util.Vector;

public class Main {

    private static double max(double[][] array) {
        double max = array[0][0];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                if (array[i][j]>max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static double sum(double[][] array) {
        double total = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                total+=array[i][j];
            }
        }
        return total;
    }

    private static int sum(int[][] array) {
        int total = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                total+=array[i][j];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Vector<Integer> middleNumbers = new Vector<>(0, 1);
        int array[][] = {{1, 2, 3, 4, 5, 6, 7},
                         {8, 9, 10, 11, 12, 13, 14},
                         {15, 16, 17, 18, 19, 20, 21},
                         {22, 23, 24, 25, 26, 27, 28},
                         {29, 30, 31, 32, 33, 34, 35},
                         {36, 37, 38, 39, 40, 41, 42},
                         {43, 44, 45, 46, 47, 48, 49}};
        for (int i=1; i<(array.length-1); i++) {
            for (int j=1; j<(array[0].length-1); j++) {
                int check[][] = {{array[i-1][j-1], array[i-1][j], array[i-1][j+1]},
                                    {array[i][j-1], array[i][j], array[i][j+1]},
                                    {array[i+1][j-1], array[i+1][j], array[i+1][j+1]}};
                int total = sum(check);
                if (total==279) {
                    middleNumbers.add(check[1][1]);
                }
            }
        }
        for (int i=0; i<middleNumbers.capacity(); i++) {
            System.out.println(middleNumbers.get(i));
        }
    }
}
