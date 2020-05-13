package mattj.sorts;

public class QuickSort {

    private static int partition(byte[] array, int lo, int hi) {
        byte pivot = array[hi];
        int i = lo-1;
        for (int j=lo; j<hi; j++) {
            if (array[j]<pivot) {
                i++;
                byte temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        byte temp = array[i+1];
        array[i+1] = array[hi];
        array[hi] = temp;
        return i+1;
    }

    private static int partition(short[] array, int lo, int hi) {
        short pivot = array[hi];
        int i = lo-1;
        for (int j=lo; j<hi; j++) {
            if (array[j]<pivot) {
                i++;
                short temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        short temp = array[i+1];
        array[i+1] = array[hi];
        array[hi] = temp;
        return i+1;
    }

    private static int partition(int[] array, int lo, int hi) {
        int pivot = array[hi];
        int i = lo-1;
        for (int j=lo; j<hi; j++) {
            if (array[j]<pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[hi];
        array[hi] = temp;
        return i+1;
    }

    private static int partition(long[] array, int lo, int hi) {
        long pivot = array[hi];
        int i = lo-1;
        for (int j=lo; j<hi; j++) {
            if (array[j]<pivot) {
                i++;
                long temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        long temp = array[i+1];
        array[i+1] = array[hi];
        array[hi] = temp;
        return i+1;
    }

    private static int partition(float[] array, int lo, int hi) {
        float pivot = array[hi];
        int i = lo-1;
        for (int j=lo; j<hi; j++) {
            if (array[j]<pivot) {
                i++;
                float temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        float temp = array[i+1];
        array[i+1] = array[hi];
        array[hi] = temp;
        return i+1;
    }

    private static int partition(double[] array, int lo, int hi) {
        double pivot = array[hi];
        int i = lo-1;
        for (int j=lo; j<hi; j++) {
            if (array[j]<pivot) {
                i++;
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        double temp = array[i+1];
        array[i+1] = array[hi];
        array[hi] = temp;
        return i+1;
    }

    private static void quickSort(byte[] array, int lo, int hi) {
        if (lo<hi) {
            int pa = partition(array, lo, hi);
            quickSort(array, lo, pa-1);
            quickSort(array, pa+1, hi);
        }
    }

    private static void quickSort(short[] array, int lo, int hi) {
        if (lo<hi) {
            int pa = partition(array, lo, hi);
            quickSort(array, lo, pa-1);
            quickSort(array, pa+1, hi);
        }
    }

    private static void quickSort(int[] array, int lo, int hi) {
        if (lo<hi) {
            int pa = partition(array, lo, hi);
            quickSort(array, lo, pa-1);
            quickSort(array, pa+1, hi);
        }
    }

    private static void quickSort(long[] array, int lo, int hi) {
        if (lo<hi) {
            int pa = partition(array, lo, hi);
            quickSort(array, lo, pa-1);
            quickSort(array, pa+1, hi);
        }
    }

    private static void quickSort(float[] array, int lo, int hi) {
        if (lo<hi) {
            int pa = partition(array, lo, hi);
            quickSort(array, lo, pa-1);
            quickSort(array, pa+1, hi);
        }
    }

    private static void quickSort(double[] array, int lo, int hi) {
        if (lo<hi) {
            int pa = partition(array, lo, hi);
            quickSort(array, lo, pa-1);
            quickSort(array, pa+1, hi);
        }
    }
    
    public static byte[] sort(byte[] array) {
        byte[] aux = array.clone();
        quickSort(aux, 0, aux.length-1);
        return aux;
    }

    public static short[] sort(short[] array) {
        short[] aux = array.clone();
        quickSort(aux, 0, aux.length-1);
        return aux;
    }

    public static int[] sort(int[] array) {
        int[] aux = array.clone();
        quickSort(aux, 0, aux.length-1);
        return aux;
    }

    public static long[] sort(long[] array) {
        long[] aux = array.clone();
        quickSort(aux, 0, aux.length-1);
        return aux;
    }

    public static float[] sort(float[] array) {
        float[] aux = array.clone();
        quickSort(aux, 0, aux.length-1);
        return aux;
    }

    public static double[] sort(double[] array) {
        double[] aux = array.clone();
        quickSort(aux, 0, aux.length-1);
        return aux;
    }

    public static void sortOverride(byte[] array) {
        quickSort(array, 0, array.length-1);
    }

    public static void sortOverride(short[] array) {
        quickSort(array, 0, array.length-1);
    }

    public static void sortOverride(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    public static void sortOverride(long[] array) {
        quickSort(array, 0, array.length-1);
    }

    public static void sortOverride(float[] array) {
        quickSort(array, 0, array.length-1);
    }

    public static void sortOverride(double[] array) {
        quickSort(array, 0, array.length-1);
    }
}