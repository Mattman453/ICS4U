package mattj.sorts;

import java.util.Random;

public class BogoSort {

    private static boolean isSorted(byte[] array) {
        for (int i=0; i<array.length-1; i++)
            if (array[i]>array[i+1])
                return false;
        return true;
    }

    private static boolean isSorted(short[] array) {
        for (int i=0; i<array.length-1; i++)
            if (array[i]>array[i+1])
                return false;
        return true;
    }

    private static boolean isSorted(int[] array) {
        for (int i=0; i<array.length-1; i++)
            if (array[i]>array[i+1])
                return false;
        return true;
    }

    private static boolean isSorted(long[] array) {
        for (int i=0; i<array.length-1; i++)
            if (array[i]>array[i+1])
                return false;
        return true;
    }

    private static boolean isSorted(float[] array) {
        for (int i=0; i<array.length-1; i++)
            if (array[i]>array[i+1])
                return false;
        return true;
    }

    private static boolean isSorted(double[] array) {
        for (int i=0; i<array.length-1; i++)
            if (array[i]>array[i+1])
                return false;
        return true;
    }

    public static byte[] sort(byte[] array) {
        byte[] aux = array.clone();
        Random number = new Random();
        while (!isSorted(aux)) {
            for (int i=0; i<aux.length; i++) {
                byte temp = aux[i];
                int rand = number.nextInt(aux.length);
                aux[i] = aux[rand];
                aux[rand] = temp;
            }
        }
        return aux;
    }
    
    public static short[] sort(short[] array) {
        short[] aux = array.clone();
        Random number = new Random();
        while (!isSorted(aux)) {
            for (int i=0; i<aux.length; i++) {
                short temp = aux[i];
                int rand = number.nextInt(aux.length);
                aux[i] = aux[rand];
                aux[rand] = temp;
            }
        }
        return aux;
    }

    public static int[] sort(int[] array) {
        int[] aux = array.clone();
        Random number = new Random();
        while (!isSorted(aux)) {
            for (int i=0; i<aux.length; i++) {
                int temp = aux[i];
                int rand = number.nextInt(aux.length);
                aux[i] = aux[rand];
                aux[rand] = temp;
            }
        }
        return aux;
    }

    public static long[] sort(long[] array) {
        long[] aux = array.clone();
        Random number = new Random();
        while (!isSorted(aux)) {
            for (int i=0; i<aux.length; i++) {
                long temp = aux[i];
                int rand = number.nextInt(aux.length);
                aux[i] = aux[rand];
                aux[rand] = temp;
            }
        }
        return aux;
    }

    public static float[] sort(float[] array) {
        float[] aux = array.clone();
        Random number = new Random();
        while (!isSorted(aux)) {
            for (int i=0; i<aux.length; i++) {
                float temp = aux[i];
                int rand = number.nextInt(aux.length);
                aux[i] = aux[rand];
                aux[rand] = temp;
            }
        }
        return aux;
    }

    public static double[] sort(double[] array) {
        double[] aux = array.clone();
        Random number = new Random();
        while (!isSorted(aux)) {
            for (int i=0; i<aux.length; i++) {
                double temp = aux[i];
                int rand = number.nextInt(aux.length);
                aux[i] = aux[rand];
                aux[rand] = temp;
            }
        }
        return aux;
    }
}