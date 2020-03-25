package app;

import mattj.Input;

/**
 * A coffee cup
 * In part 2, additional information will be added to this cup
 * @author RD
 */
public class CoffeeCup {
    private String name;
    private int cupsRemaining = 0;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSize(String size) {
        if (size.contains("s")) {
            setSize(Size.SMALL);
        } else if (size.contains("m")) {
            setSize(Size.MEDIUM);
        } else if (size.equals("l")) {
            setSize(Size.LARGE);
        } else {
            setSize(Size.EXTRALARGE);
        }
    }

    private Size size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fill() {
        if (size==Size.SMALL) {
            cupsRemaining = 2;
        } else if (size==Size.MEDIUM) {
            cupsRemaining = 4;
        } else if (size==Size.LARGE) {
            cupsRemaining = 6;
        } else {
            cupsRemaining = 8;
        }
    }

    public void fill(int coffee) {
        cupsRemaining = coffee;
    }

    /**
     * Drink this cup entirely
     */
    public boolean drink() {
        if (cupsRemaining>0) {
            System.out.println(name + ". You glug " + cupsRemaining + " ounces of coffee down.");
            cupsRemaining = 0;
            return true;
        } else {
            System.out.println(name + ". You sip furiously, but only suck air.");
            return false;
        }
    }

    public CoffeeCup() {
        System.out.print("What is your name: ");
        name = Input.getWord();
        System.out.print("Hello " + name + ". What size do you want(S/M/L/XL): ");
        setSize(Input.getWord().toLowerCase());
    }

}
