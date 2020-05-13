package mattj.sorts;

public class MergeSort { 

    private static void merge(byte array[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        byte[] L = new byte[n1]; 
        byte[] R = new byte[n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i<n1 && j<n2) { 
            if (L[i]<=R[j]) { 
                array[k] = L[i]; 
                i++; 
            } else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j<n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    private static void merge(short array[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        short[] L = new short[n1]; 
        short[] R = new short[n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i<n1 && j<n2) { 
            if (L[i]<=R[j]) { 
                array[k] = L[i]; 
                i++; 
            } else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j<n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    private static void merge(int array[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int[] L = new int[n1]; 
        int[] R = new int[n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i<n1 && j<n2) { 
            if (L[i]<=R[j]) { 
                array[k] = L[i]; 
                i++; 
            } else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j<n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    private static void merge(long array[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        long[] L = new long[n1]; 
        long[] R = new long[n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i<n1 && j<n2) { 
            if (L[i]<=R[j]) { 
                array[k] = L[i]; 
                i++; 
            } else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j<n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    private static void merge(float array[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        float[] L = new float[n1]; 
        float[] R = new float[n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i<n1 && j<n2) { 
            if (L[i]<=R[j]) { 
                array[k] = L[i]; 
                i++; 
            } else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j<n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    private static void merge(double array[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        double[] L = new double[n1]; 
        double[] R = new double[n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i<n1 && j<n2) { 
            if (L[i]<=R[j]) { 
                array[k] = L[i]; 
                i++; 
            } else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j<n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    private static void mergeSort(byte arr[], int l, int r) { 
        if (l<r) { 
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 
    
    private static void mergeSort(short arr[], int l, int r) { 
        if (l<r) { 
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 

    private static void mergeSort(int arr[], int l, int r) { 
        if (l<r) { 
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 

    private static void mergeSort(long arr[], int l, int r) { 
        if (l<r) { 
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 

    private static void mergeSort(float arr[], int l, int r) { 
        if (l<r) { 
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 

    private static void mergeSort(double arr[], int l, int r) { 
        if (l<r) { 
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 
  
    public static byte[] sort(byte[] array) {   
        byte[] aux = array.clone();  
        mergeSort(aux, 0, aux.length-1); 
        return aux;
    }
    
    public static short[] sort(short[] array) {   
        short[] aux = array.clone();  
        mergeSort(aux, 0, aux.length-1); 
        return aux;
    }

    public static int[] sort(int[] array) {   
        int[] aux = array.clone();  
        mergeSort(aux, 0, aux.length-1); 
        return aux;
    }

    public static long[] sort(long[] array) {   
        long[] aux = array.clone();  
        mergeSort(aux, 0, aux.length-1); 
        return aux;
    }

    public static float[] sort(float[] array) {   
        float[] aux = array.clone();  
        mergeSort(aux, 0, aux.length-1); 
        return aux;
    }

    public static double[] sort(double[] array) {   
        double[] aux = array.clone();  
        mergeSort(aux, 0, aux.length-1); 
        return aux;
    }

    public static void sortOverride(byte[] array) {    
        mergeSort(array, 0, array.length-1); 
    }
    
    public static void sortOverride(short[] array) {     
        mergeSort(array, 0, array.length-1); 
    }

    public static void sortOverride(int[] array) {     
        mergeSort(array, 0, array.length-1); 
    }

    public static void sortOverride(long[] array) {     
        mergeSort(array, 0, array.length-1); 
    }

    public static void sortOverride(float[] array) {     
        mergeSort(array, 0, array.length-1); 
    }

    public static void sortOverride(double[] array) {    
        mergeSort(array, 0, array.length-1); 
    }
} 