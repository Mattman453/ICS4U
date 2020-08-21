package mattj.sorts;

import java.util.ArrayList;

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

    public static String[] sort(String[] array) {
        String[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j].compareTo(aux[j+1])>0) {
                    String temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static ArrayList<String> sort(ArrayList<String> array) {
        String[] aux = (String[])array.toArray();
        sortOverride(aux);
        ArrayList<String> temp = new ArrayList<>();
        for (String i : array) {
            temp.add(i);
        }
        return temp;
    }

    public static byte[] sort(byte[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        byte[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]<aux[j+1]) {
                    byte temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static short[] sort(short[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        short[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]<aux[j+1]) {
                    short temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static int[] sort(int[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        int[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]<aux[j+1]) {
                    int temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static long[] sort(long[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        long[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]<aux[j+1]) {
                    long temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static float[] sort(float[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        float[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]<aux[j+1]) {
                    float temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static double[] sort(double[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        double[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j]<aux[j+1]) {
                    double temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static String[] sort(String[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            return sort(array);
        }
        String[] aux = array.clone();
        for (int i=0; i<(aux.length-1); i++) {
            for (int j=0; j<(aux.length-i-1); j++) {
                if (aux[j].compareTo(aux[j+1])<0) {
                    String temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    
    public static ArrayList<String> sort(ArrayList<String> array, SortDirection direction) {
        String[] aux = (String[])array.toArray();
        if (direction==SortDirection.Ascending) {
            sortOverride(aux);
        }
        sortOverride(aux, SortDirection.Descending);
        ArrayList<String> temp = new ArrayList<>();
        for (String i : array) {
            temp.add(i);
        }
        return temp;
    }

    public static void sortOverride(byte[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j]>array[j+1]) {
                    byte temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(short[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j]>array[j+1]) {
                    short temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(int[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(long[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j]>array[j+1]) {
                    long temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(float[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j]>array[j+1]) {
                    float temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(double[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j]>array[j+1]) {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(String[] array) {
        for (int i=0; i<(array.length-1); i++) {
            for (int j=0; j<(array.length-i-1); j++) {
                if (array[j].compareTo(array[j+1])<0) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sortOverride(byte[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j]>array[j+1]) {
                        byte temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void sortOverride(short[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j]>array[j+1]) {
                        short temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void sortOverride(int[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j]>array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void sortOverride(long[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j]>array[j+1]) {
                        long temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void sortOverride(float[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j]>array[j+1]) {
                        float temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void sortOverride(double[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j]>array[j+1]) {
                        double temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void sortOverride(String[] array, SortDirection direction) {
        if (direction==SortDirection.Ascending) {
            sortOverride(array);
        } else {
            for (int i=0; i<(array.length-1); i++) {
                for (int j=0; j<(array.length-i-1); j++) {
                    if (array[j].compareTo(array[j+1])<0) {
                        String temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }
}