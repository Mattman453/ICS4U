package ics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel screen;
    private JLabel purpose;
    private JLabel firstNumber;
    private JLabel secondNumber;
    private JButton add;
    private JButton clear;
    private JTextField entry1;
    private JTextField entry2;
    private JTextField output;

    public Calculator() {
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first = Double.parseDouble(entry1.getText());
                double second = Double.parseDouble(entry2.getText());
                double total = first+second;
                output.setText(Double.toString(total));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry1.setText("");
                entry2.setText("");
                output.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().screen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
