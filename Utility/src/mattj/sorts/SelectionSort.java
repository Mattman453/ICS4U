package mattj.sorts;

public class SelectionSort {

    public static byte[] selectionSort(byte[] array) {
        byte[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<aux.length; j++)
                if (aux[j]<aux[min_idx])
                    min_idx = j;
                byte temp = aux[min_idx];
                aux[min_idx] = aux[i];
                aux[i] = temp;
        }
        return aux;
    }

    public static short[] selectionSort(short[] array) {
        short[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<aux.length; j++)
                if (aux[j]<aux[min_idx])
                    min_idx = j;
                short temp = aux[min_idx];
                aux[min_idx] = aux[i];
                aux[i] = temp;
        }
        return aux;
    }

    public static int[] selectionSort(int[] array) {
        int[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<aux.length; j++)
                if (aux[j]<aux[min_idx])
                    min_idx = j;
                int temp = aux[min_idx];
                aux[min_idx] = aux[i];
                aux[i] = temp;
        }
        return aux;
    }

    public static long[] selectionSort(long[] array) {
        long[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<aux.length; j++)
                if (aux[j]<aux[min_idx])
                    min_idx = j;
                long temp = aux[min_idx];
                aux[min_idx] = aux[i];
                aux[i] = temp;
        }
        return aux;
    }

    public static float[] selectionSort(float[] array) {
        float[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<aux.length; j++)
                if (aux[j]<aux[min_idx])
                    min_idx = j;
                float temp = aux[min_idx];
                aux[min_idx] = aux[i];
                aux[i] = temp;
        }
        return aux;
    }

    public static double[] selectionSort(double[] array) {
        double[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<aux.length; j++)
                if (aux[j]<aux[min_idx])
                    min_idx = j;
                double temp = aux[min_idx];
                aux[min_idx] = aux[i];
                aux[i] = temp;
        }
        return aux;
    }
}