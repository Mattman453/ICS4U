package mattj.search;

public class BinarySearch {

    public static int search(int[] array, int desiredNumber) {
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
    
}