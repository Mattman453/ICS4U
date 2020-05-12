package mattj.sorts;

public class RadixSort {

    private static byte getMax(byte[] array) {
        byte max = array[0];
        for (int i=1; i<array.length; i++) 
            if (array[i]>max)
                max = array[i];
        return max;
    }

    private static short getMax(short[] array) {
        short max = array[0];
        for (int i=1; i<array.length; i++) 
            if (array[i]>max)
                max = array[i];
        return max;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i=1; i<array.length; i++) 
            if (array[i]>max)
                max = array[i];
        return max;
    }

    private static long getMax(long[] array) {
        long max = array[0];
        for (int i=1; i<array.length; i++) 
            if (array[i]>max)
                max = array[i];
        return max;
    }

    private static void countSort(byte[] array, int exp) {
        byte[] output = new byte[array.length];
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<array.length; i++)
            count[(array[i]/exp)%10]++;
        for (int i=1; i<10; i++) 
            count[i]+=count[i-1];
        for (int i=array.length-1; i>=0; i--) {
            output[count[(array[i]/exp)%10]-1] = array[i];
            count[(array[i]/exp)%10]--;
        }
        for (int i=0; i<array.length; i++) 
            array[i] = output[i];
    }

    private static void countSort(short[] array, int exp) {
        short[] output = new short[array.length];
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<array.length; i++)
            count[(array[i]/exp)%10]++;
        for (int i=1; i<10; i++) 
            count[i]+=count[i-1];
        for (int i=array.length-1; i>=0; i--) {
            output[count[(array[i]/exp)%10]-1] = array[i];
            count[(array[i]/exp)%10]--;
        }
        for (int i=0; i<array.length; i++) 
            array[i] = output[i];
    }

    private static void countSort(int[] array, int exp) {
        int[] output = new int[array.length];
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<array.length; i++)
            count[(array[i]/exp)%10]++;
        for (int i=1; i<10; i++) 
            count[i]+=count[i-1];
        for (int i=array.length-1; i>=0; i--) {
            output[count[(array[i]/exp)%10]-1] = array[i];
            count[(array[i]/exp)%10]--;
        }
        for (int i=0; i<array.length; i++) 
            array[i] = output[i];
    }

    private static void countSort(long[] array, int exp) {
        long[] output = new long[array.length];
        long[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<array.length; i++)
            count[(int) ((array[i] / exp) % 10)]++;
        for (int i=1; i<10; i++) 
            count[i]+=count[i-1];
        for (int i=array.length-1; i>=0; i--) {
            output[(int) (count[(int) ((array[i] / exp) % 10)] - 1)] = array[i];
            count[(int) ((array[i] / exp) % 10)]--;
        }
        for (int i=0; i<array.length; i++) 
            array[i] = output[i];
    }
    
    public static byte[] sort(byte[] array) {
        byte[] aux = array.clone();
        byte m = getMax(aux);
        for (int exp=1; m/exp>0; exp*=10) 
            countSort(aux, exp);
        return aux;
    }

    public static short[] sort(short[] array) {
        short[] aux = array.clone();
        short m = getMax(aux);
        for (int exp=1; m/exp>0; exp*=10) 
            countSort(aux, exp);
        return aux;
    }

    public static int[] sort(int[] array) {
        int[] aux = array.clone();
        int m = getMax(aux);
        for (int exp=1; m/exp>0; exp*=10) 
            countSort(aux, exp);
        return aux;
    }

    public static long[] sort(long[] array) {
        long[] aux = array.clone();
        long m = getMax(aux);
        for (int exp=1; m/exp>0; exp*=10) 
            countSort(aux, exp);
        return aux;
    }
}