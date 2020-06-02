package app;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void alphabetize(@NotNull Stack<String> stack) {
        Stack<String> backup = (Stack<String>)stack.clone();
        Vector<String> order = new Vector<>(0, 1);
        while(!stack.isEmpty()) {
            order.add(stack.pop());
        }
        order.sort(String::compareTo);
        System.out.println(order.toString());
        stack = (Stack<String>)backup.clone();
    }

    public static void main(String[] args) {
        Stack<String> exams = new Stack();
        Scanner input = null;
        try {
            input = new Scanner(new File("C:\\Users\\mattj\\Downloads\\exams.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (input!=null) {
            while (input.hasNextLine()) {
                exams.add(input.nextLine());
            }
            alphabetize(exams);
            input.close();
        }
    }
}
