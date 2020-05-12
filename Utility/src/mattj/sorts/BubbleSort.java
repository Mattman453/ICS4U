package mattj.sorts;

public class BubbleSort {

    public static byte[] bubbleSort(byte[] array) {
        byte[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]>aux[j+1]) {
                    byte temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static short[] bubbleSort(short[] array) {
        short[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]>aux[j+1]) {
                    short temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static int[] bubbleSort(int[] array) {
        int[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]>aux[j+1]) {
                    int temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static long[] bubbleSort(long[] array) {
        long[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]>aux[j+1]) {
                    long temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static float[] bubbleSort(float[] array) {
        float[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]>aux[j+1]) {
                    float temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static double[] bubbleSort(double[] array) {
        double[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]>aux[j+1]) {
                    double temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }
}