package mattj.sorts;

public class BubbleSort {

    public static byte[] sort(byte[] array) {
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

    public static short[] sort(short[] array) {
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

    public static int[] sort(int[] array) {
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

    public static long[] sort(long[] array) {
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

    public static float[] sort(float[] array) {
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

    public static double[] sort(double[] array) {
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