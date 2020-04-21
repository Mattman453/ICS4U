package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String stats[][] = new String[10][9];
        String[] categories = {"Name", "Completions", "Attempts", "Percentage", "Passing Yards", "Yards/Attempt", "TouchDowns", "Interceptions", "Sacks"};
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\mattj\\Downloads\\Quarterbacks.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (scanner!=null) {
            for (int i=0; i<10; i++) {
                String line = scanner.nextLine();
                StringTokenizer phrase = new StringTokenizer(line, ",");
                for (int j=0; j<9; j++) {
                    stats[i][j] = phrase.nextToken();
                }
            }
            for (int i=0; i<10; i++) {
                for (int j=0; j<9; j++) {
                    System.out.print(stats[i][j] + "\t");
                }
                System.out.println("");
            }
            for (int j=1; j<9; j++) {
                String best = "";
                double number = 0;
                for (int i = 0; i < 10; i++) {
                    if(Double.parseDouble(stats[i][j])>number) {
                        number = Double.parseDouble(stats[i][j]);
                        best = stats[i][0];
                    }
                }
                System.out.println(best + " has the highest " + categories[j] + " at " + number);
            }
        }
    }
}
