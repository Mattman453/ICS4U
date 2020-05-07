package app;

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

    public static void main(String[] args) {
        double array[][] = new double[10][5];
    }
}
