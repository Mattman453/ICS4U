package app;

import mattj.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class IntObj {
    public int value = 0;
}

public class Main {

    public static void printMenu() {
        System.out.println("Menu – Type the number of the desired option");
        System.out.println("1 Search Product");
        System.out.println("2 Reduce Inventory");
        System.out.println("3 Add New Product");
        System.out.println("4 Bulk Price Change");
        System.out.println("5 Exit");
    }

    public static void search(Vector<String> productNames, Vector<Integer> quantity, Vector<Double> unitPrice, IntObj items) {
        System.out.print("Enter product name: ");
        String product = Input.getLine();
        boolean found = false;
        for (int i=0; i<items.value; i++) {
            if (productNames.get(i).equals(product)) {
                System.out.println(productNames.get(i) + "," + quantity.get(i) + "," + unitPrice.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found. Check spelling and capitals.");
        }
    }

    public static void reduce(Vector<String> productNames, Vector<Integer> quantity, IntObj items) {
        String product;
        int index = 0;
        do {
            System.out.print("Enter product name: ");
            product = Input.getLine();
            boolean found = false;
            for (int i=0; i<items.value; i++) {
                if (productNames.get(i).equals(product)) {
                    index = i;
                    found = true;
                }
            }
            if (found) {
                System.out.print("Enter amount to take: ");
                int remove = (int)Input.getNumber();
                Input.getLine();
                if (remove>quantity.get(index)) {
                    System.out.println("You requested " + remove + " " + productNames.get(index) + " but there are only " + quantity.get(index) + " in stock. You now have 0. Please reorder.");
                    quantity.add(index, 0);
                } else {
                    quantity.add(index, quantity.get(index)-remove);
                    System.out.println("You requested " + remove + " " + productNames.get(index) + ". You now have " + quantity.get(index) + ".");
                }
            }
        } while (!product.equals("cancel"));
    }

    public static void addNew(Vector<String> productNames, Vector<Integer> quantity, Vector<Double> unitPrice, IntObj items) {

    }

    public static void changePrice(Vector<String> productNames, Vector<Integer> quantity, Vector<Double> unitPrice) {

    }

    public static void main(String[] args) {
        Scanner scanner = null;
        IntObj items = new IntObj();
        Vector<String> productNames = new Vector<>(0, 1);
        Vector<Integer> quantity = new Vector<>(0, 1);
        Vector<Double> unitPrice = new Vector<>(0, 1);
        try {
            scanner = new Scanner(new File("C:\\Users\\mattj\\Downloads\\Inventory.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(scanner!=null) {
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                StringTokenizer phrase = new StringTokenizer(input, ",");
                productNames.add(phrase.nextToken());
                quantity.add(Integer.parseInt(phrase.nextToken()));
                unitPrice.add(Double.parseDouble(phrase.nextToken()));
                items.value++;
            }
            while (true) {
                printMenu();
                String input = Input.getLine();
                if (input.equals("5"))
                    break;

                switch (input) {
                    case "1":
                        search(productNames, quantity, unitPrice, items);
                        break;
                    case "2":
                        reduce(productNames, quantity, items);
                        break;
                    case "3":
                        addNew(productNames, quantity, unitPrice, items);
                        break;
                    case "4":
                        changePrice(productNames, quantity, unitPrice);
                        break;
                    default:
                        System.out.println("Option not found. Retype number. If not functioning, contact developer.");
                        break;
                }
            }
            scanner.close();
            PrintWriter printWriter = null;
            try {
                printWriter = new PrintWriter(new File("C:\\Users\\mattj\\Downloads\\Inventory.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (printWriter!=null) {
                for(int i=0; i<items.value; i++) {
                    printWriter.println(productNames.get(i) + "," + quantity.get(i) + "," + unitPrice.get(i));
                }
                printWriter.close();
            }
        }
    }
}
