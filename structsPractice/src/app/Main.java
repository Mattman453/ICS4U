package app;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void mirror(@NotNull Queue<String> queue) {
        Vector<String> order = new Vector<>(0, 1);
        while (!queue.isEmpty()) {
            order.add(queue.remove());
        }
        for (int i=0; i<order.capacity(); i++) {
            queue.add(order.get(i));
        }
        for (int i=order.capacity()-1; i>=0; i--) {
            queue.add(order.get(i));
        }
        System.out.println(queue.toString());
    }

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
        Queue<String> mirror = new LinkedList<>();
        mirror.add("a");
        mirror.add("b");
        mirror.add("c");
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
            mirror(mirror);
            input.close();
        }
    }
}
