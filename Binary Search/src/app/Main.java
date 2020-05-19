package app;

import mattj.sorts.BubbleSort;

public class Main {

    public static int linearSearch(int[] array, int desiredNumber) {
        for (int i=0; i<array.length; i++) {
            if (array[i]==desiredNumber) {
                System.out.println("The number " + desiredNumber + " is in array position " + i + ".");
                return i;
            }
        }
        System.out.println(desiredNumber + " not found.");
        return -1;
    }

    public static int binarySearch(int[] array, int desiredNumber) {
        int low = 0;
        int high = array.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            int value = array[mid];
            if (value<desiredNumber) {
                low = mid+1;
            } else if (value>desiredNumber) {
                high = mid-1;
            } else {
                System.out.println("The number " + desiredNumber + " is in array position " + mid + ".");
                return mid;
            }
        }
        System.out.println(desiredNumber + " not found.");
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {100, 73, 52, 51, 43, 32, 29, 25, 21, 3};
        BubbleSort.sortOverride(array);
        linearSearch(array, 29);
        binarySearch(array, 3);
    }
}
