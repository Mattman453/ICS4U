/*
Author: Matt Cruickshank
Purpose: The purpose of this class is to allow simpler use of files for both input and output without declaring output systems and input systems every time a file needs to be changed.
*/

package mattj;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileModifier {

    // Create global objects for all functions to access
    public Scanner fileReader;
    PrintWriter printWriter;
    File inputFile;
    File outputFile;

    public FileModifier(String file) throws IOException {
        this(file, file);
    }

    public FileModifier(String inputFile, String outputFile) throws IOException {
        this(new File(inputFile), new File(outputFile));
    }

    // Sets the scaner to read the input file
    public FileModifier(File file) throws IOException {
        this(file, file);
    }

    // Sets the scanner to read the input file and the print writer to send information to the output file
    public FileModifier(File inputFile, File outputFile) throws IOException {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        fileReader = new Scanner(inputFile);
        printWriter = new PrintWriter(outputFile);
    }

    // Grab a line from the input file
    public String getLine() {
        return fileReader.nextLine();
    }

    // Grab a word from the input file
    public String getWord() {
        return fileReader.next();
    }

    // Grab a number from the input file. Use parenthesis to change to int if necessary
    public double getNumber() {
        return fileReader.nextDouble();
    }

    // Put a full line of text to the output file
    public void addLine(String line) {
        printWriter.println(line);
    }

    // Put a number in the output file
    public void addNumber(double number) {
        String temp = Double.toString(number);
        printWriter.print(temp);
    }

    // Go to the next line
    public void newLine() {
        printWriter.println();
    }

    // Put a line of text to the output file. Next stuff wil be on the same line
    public void addWord(String word) {
        printWriter.print(word);
    }

    // Close the stream
    public void close() {
        fileReader.close();
        printWriter.close();
    }

    public void closeRead() {
        fileReader.close();
    }

    public void closeWrite() {
        printWriter.close();
    }
}