package mattj.sorts;

public class InsertionSort {

    public static short[] sort(short[] array) {
        short[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            short h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j]>h) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }
    
    public static int[] sort(int[] array) {
        int[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            int h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j]>h) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }

    public static long[] sort(long[] array) {
        long[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            long h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j]>h) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }

    public static float[] sort(float[] array) {
        float[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            float h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j]>h) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }

    public static double[] sort(double[] array) {
        double[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            double h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j]>h) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }
}