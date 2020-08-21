package mattj.sorts;

public class InsertionSort {

    public static byte[] sort(byte[] array) {
        byte[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            byte h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j]>h) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }

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

    public static String[] sort(String[] array) {
        String[] aux = array.clone();
        for (int i=1; i<aux.length; i++) {
            String h = aux[i];
            int j = i-1;
            while (j>=0 && aux[j].compareTo(h)<0) {
                aux[j+1] = aux[j];
                j--;
            }
            aux[j+1] = h;
        }
        return aux;
    }

    public static void sortOverride(byte[] array) {
        for (int i=1; i<array.length; i++) {
            byte h = array[i];
            int j = i-1;
            while (j>=0 && array[j]>h) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }

    public static void sortOverride(short[] array) {
        for (int i=1; i<array.length; i++) {
            short h = array[i];
            int j = i-1;
            while (j>=0 && array[j]>h) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }
    
    public static void sortOverride(int[] array) {
        for (int i=1; i<array.length; i++) {
            int h = array[i];
            int j = i-1;
            while (j>=0 && array[j]>h) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }

    public static void sortOverride(long[] array) {
        for (int i=1; i<array.length; i++) {
            long h = array[i];
            int j = i-1;
            while (j>=0 && array[j]>h) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }

    public static void sortOverride(float[] array) {
        for (int i=1; i<array.length; i++) {
            float h = array[i];
            int j = i-1;
            while (j>=0 && array[j]>h) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }

    public static void sortOverride(double[] array) {
        for (int i=1; i<array.length; i++) {
            double h = array[i];
            int j = i-1;
            while (j>=0 && array[j]>h) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }

    public static void sortOverride(String[] array) {
        for (int i=1; i<array.length; i++) {
            String h = array[i];
            int j = i-1;
            while (j>=0 && array[j].compareTo(h)<0) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = h;
        }
    }
}