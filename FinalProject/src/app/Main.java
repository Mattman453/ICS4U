package app;

import mattj.sorts.BubbleSort;
import mattj.sorts.SelectionSort;
import mattj.sorts.SortDirection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean isSorted = false;
    static SortDirection currentDirection = null;

    public static int printOptions(Scanner scanner) {
        System.out.println("Choose:");
        System.out.println("1 - Read Names From File and Display List");
        System.out.println("2 - Bubble Sort Ascending");
        System.out.println("3 - Bubble Sort Descending");
        System.out.println("4 - Selection Sort Ascending");
        System.out.println("5 - Selection Sort Descending");
        System.out.println("6 - Binary Search (number and name)");
        System.out.println("7 - Exit");
        return scanner.nextInt();
    }

    public static int binarySearch(ArrayList<String> array, String phrase) {
        String aux[] = new String[array.size()];
        for (int i=0; i<array.size(); i++) {
            aux[i] = array.get(i);
        }
        if (!isSorted) {
            System.out.println("Array must be sorted before a search can be completed.");
            return -2;
        } else if (currentDirection==SortDirection.Ascending) {
            int low = 0;
            int high = aux.length-1;
            while (low<=high) {
                int mid = (low+high)/2;
                String value = aux[mid];
                if (value.compareTo(phrase)<0) {
                    low = mid+1;
                } else if (value.compareTo(phrase)>0) {
                    high = mid-1;
                } else {
                    System.out.println("The name " + phrase + " is in array position " + mid + ".");
                    return mid;
                }
            }
            System.out.println(phrase + " not found.");
            return -1;
        } else {
            int low = 0;
            int high = aux.length-1;
            while (low<=high) {
                int mid = (low+high)/2;
                String value = aux[mid];
                if (value.compareTo(phrase)>0) {
                    low = mid+1;
                } else if (value.compareTo(phrase)<0) {
                    high = mid-1;
                } else {
                    System.out.println("The phrase " + phrase + " is in array position " + mid + ".");
                    return mid;
                }
            }
            System.out.println(phrase + " not found.");
            return -1;
        }
    }

    public static ArrayList<String> bubbleSort(ArrayList<String> array, SortDirection direction) {
        if (array.isEmpty())
            return array;
        currentDirection = direction;
        String[] aux = new String[array.size()];
        for (int i=0; i<array.size(); i++) {
            aux[i] = array.get(i);
        }
        aux = BubbleSort.sort(aux, direction);
        ArrayList<String> temp = new ArrayList<>();
        for (int i=0; i<array.size(); i++) {
            temp.add(aux[i]);
        }
        isSorted = true;
        return temp;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> array, SortDirection direction) {
        if (array.isEmpty()) {
            System.out.println("Array is empty. Grab names then try again.");
            return array;
        }
        currentDirection = direction;
        String[] aux = new String[array.size()];
        for (int i=0; i<array.size(); i++) {
            aux[i] = array.get(i);
        }
        aux = SelectionSort.sort(aux, direction);
        ArrayList<String> temp = new ArrayList<>();
        for (int i=0; i<array.size(); i++) {
            temp.add(aux[i]);
        }
        isSorted = true;
        return temp;
    }

    public static ArrayList<String> getNames() {
        ArrayList<String> array = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\mattj\\Downloads\\TheListFile.txt"));
            while (scanner.hasNextLine()) {
                array.add(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(array.toString());
        return array;
    }

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner input = new Scanner(System.in);
            int answer = 0;
            do {
                answer = printOptions(input);
                switch (answer) {
                    case 1:
                        array = getNames();
                        break;
                    case 2:
                        array = bubbleSort(array, SortDirection.Ascending);
                        break;
                    case 3:
                        array = bubbleSort(array, SortDirection.Descending);
                        break;
                    case 4:
                        array = selectionSort(array, SortDirection.Ascending);
                        break;
                    case 5:
                        array = selectionSort(array, SortDirection.Descending);
                        break;
                    case 6:
                        binarySearch(array, input.next());
                        break;
                    default:
                        break;
                }
            } while (answer!=7);
            input.close();
        }
}
