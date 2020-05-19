package mattj.search;

public class LinearSearch {
    
    public static int search(int[] array, int desiredNumber) {
        for (int i=0; i<array.length; i++) {
            if (array[i]==desiredNumber) {
                System.out.println("The number " + desiredNumber + " is in array position " + i + ".");
                return i;
            }
        }
        System.out.println(desiredNumber + " not found.");
        return -1;
    }
}