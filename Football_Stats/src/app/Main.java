package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[10];
        int[] completions = new int[10];
        int[] attempts = new int[10];
        double[] percentage = new double[10];
        int[] passingYards = new int[10];
        double[] yardsPerAttempt = new double[10];
        int[] touchdowns = new int[10];
        int[] interceptions = new int[10];
        int[] sacks = new int[10];
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\mattj\\Downloads\\Quarterbacks.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (scanner!=null) {
            for (int i = 0; i < 10; i++) {
                String line = scanner.nextLine();
                StringTokenizer phrase = new StringTokenizer(line, ",");
                names[i] = phrase.nextToken();
                completions[i] = Integer.parseInt(phrase.nextToken());
                attempts[i] = Integer.parseInt(phrase.nextToken());
                percentage[i] = Double.parseDouble(phrase.nextToken());
                passingYards[i] = Integer.parseInt(phrase.nextToken());
                yardsPerAttempt[i] = Double.parseDouble(phrase.nextToken());
                touchdowns[i] = Integer.parseInt(phrase.nextToken());
                interceptions[i] = Integer.parseInt(phrase.nextToken());
                sacks[i] = Integer.parseInt(phrase.nextToken());
            }
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s\t%d\t%d\t%.1f\t%d\t%.1f\t%d\t%d\t%d\n", names[i], completions[i], attempts[i], percentage[i], passingYards[i], yardsPerAttempt[i], touchdowns[i], interceptions[i], sacks[i]);
            }
            String name = "";
            int best = 0;
            for (int i=0; i<10; i++) {
                if (completions[i]>best) {
                    best = completions[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Completions at " + best);
            best = 0;
            for (int i=0; i<10; i++) {
                if (attempts[i]>best) {
                    best = attempts[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Attempts at " + best);
            double bestf = 0;
            for (int i=0; i<10; i++) {
                if (percentage[i]>bestf) {
                    bestf = percentage[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Percentage at " + bestf);
            best = 0;
            for (int i=0; i<10; i++) {
                if (passingYards[i]>best) {
                    best = passingYards[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Passing Yards at " + best);
            bestf = 0;
            for (int i=0; i<10; i++) {
                if (yardsPerAttempt[i]>bestf) {
                    bestf = yardsPerAttempt[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Yards/Attempt at " + bestf);
            best = 0;
            for (int i=0; i<10; i++) {
                if (touchdowns[i]>best) {
                    best = touchdowns[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest TouchDowns at " + best);
            best = 0;
            for (int i=0; i<10; i++) {
                if (interceptions[i]>best) {
                    best = interceptions[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Interceptions at " + best);
            best = 0;
            for (int i=0; i<10; i++) {
                if (sacks[i]>best) {
                    best = sacks[i];
                    name = names[i];
                }
            }
            System.out.println(name + " has the highest Sacks at " + best);
        }
    }
}
