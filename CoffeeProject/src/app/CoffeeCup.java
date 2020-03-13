package app;

import mattj.Input;

/**
 * A coffee cup
 * In part 2, additional information will be added to this cup
 * @author RD
 */
public class CoffeeCup {

    private boolean isFull;  // Is this cup full?  Default value false.
    private String name;

    /**
     * Returns whether this cup is full (true) or empty(false);
     * @return is this cup full?
     */
    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Fill this cup to the top
     */
    public void fill() {
        isFull = true;
    }

    /**
     * Drink this cup entirely
     */
    public boolean drink() {
        if (isFull) {
            System.out.println(name + ". You glug the coffee down.");
            isFull = false;
            return true;
        } else {
            System.out.println(name + ". You sip furiously, but only suck air.");
            return false;
        }
    }

    public CoffeeCup() {
        System.out.print("What is your name: ");
        name = Input.getWord();
        System.out.println("Hello " + name + ".");
        isFull = false;
    }

}
