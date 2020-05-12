package app;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void selectionSort(int[] array) {
        for (int i=0; i<(array.length-1); i++) {
            int min_idx = i;
            for (int j=i+1; j<array.length; j++)
                if (array[j]<array[min_idx])
                    min_idx = j;
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
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

    public static void insertionSort(int[] array) {
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

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\mattj\\Downloads\\Numbers.txt"));
            printWriter = new PrintWriter(new File("C:\\Users\\mattj\\Downloads\\Sorted.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (scanner!=null) {
            Vector<Integer> temp = new Vector<>(0, 1);
            int i = 0;
            while (scanner.hasNextLine()) {
                temp.add(Integer.parseInt(scanner.nextLine()));
                i++;
            }
            int[] array = new int[i];
            for (int j = 0; j < i; j++) {
                array[j] = temp.get(j);
            }
            insertionSort(array);
            if (printWriter!=null) {
                for (int value : array) {
                    printWriter.println(value);
                    System.out.print(value + " ");
                }
                printWriter.close();
            } else {
                for (int value : array) {
                    System.out.print(value + " ");
                }
            }
            scanner.close();
        }
    }
}
