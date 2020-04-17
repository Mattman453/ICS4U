package app;

import mattj.FileModifier;
import mattj.Input;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FileModifier modifier;
        try {
            modifier = new FileModifier(new File("C:\\Users\\mattj\\Dropbox\\Java\\Programs\\ICS4U\\Mark_Writer\\src\\app\\marks.txt"));
        } catch (IOException e) {
            modifier = null;
            e.printStackTrace();
        }

        if (modifier!=null) {
            boolean first = true;
            while (true) {
                System.out.print("Enter Name And Mark: ");
                String name = Input.getWord();
                if (name.equals("xx"))
                    break;
                int mark = (int)Input.getNumber();
                if (!first) {
                    modifier.newLine();
                }
                modifier.addWord(name + "\t" + mark);
                first = false;
            }
            modifier.closeWrite();
            String[] names = new String[100];
            double[] marks = new double[100];
            int position = 0;
            while (true) {
                if (modifier.fileReader.hasNextLine()) {
                    String info = modifier.getLine();
                    StringTokenizer phrase = new StringTokenizer(info, "\t");
                    names[position] = phrase.nextToken();
                    marks[position] = Integer.parseInt(phrase.nextToken());
                    position++;
                } else
                    break;
            }
            double total = 0;
            for(int i=0; i<position; i++) {
                total+= marks[i];
            }
            total/=position;
            System.out.println(total);
            modifier.closeRead();
        }
    }
}
