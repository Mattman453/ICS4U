package app;

public class CoffeePot {
    private int waterRemaining = 0;
    public void fill() {
        fill(10);
    }

    public void fill(int waterToAdd) {
        waterRemaining = waterToAdd;
    }

    public void pour(CoffeeCup cup) {
        if(cup.getSize()==Size.SMALL) {
            if (waterRemaining>=2) {
                System.out.println("Filling cup with " + 2 + " cups of coffee.");
                cup.fill();
                waterRemaining-=2;
            } else if (waterRemaining>0) {
                System.out.println("Filling cup with " + waterRemaining + " cups of coffee.");
                cup.fill();
                waterRemaining = 0;
            } else {
                System.out.println("No water remaining in pot. Must be filled in coffee machine.");
            }
        } else if (cup.getSize()==Size.MEDIUM) {
            if (waterRemaining>=4) {
                System.out.println("Filling cup with " + 4 + " cups of coffee.");
                cup.fill();
                waterRemaining-=4;
            } else if (waterRemaining>0) {
                System.out.println("Filling cup with " + waterRemaining + " cups of coffee.");
                cup.fill();
                waterRemaining = 0;
            } else {
                System.out.println("No water remaining in pot. Must be filled in coffee machine.");
            }
        } else if (cup.getSize()==Size.LARGE) {
            if (waterRemaining>=6) {
                System.out.println("Filling cup with " + 6 + " cups of coffee.");
                cup.fill();
                waterRemaining-=6;
            } else if (waterRemaining>0) {
                System.out.println("Filling cup with " + waterRemaining + " cups of coffee.");
                cup.fill();
                waterRemaining = 0;
            } else {
                System.out.println("No water remaining in pot. Must be filled in coffee machine.");
            }
        } else {
            if (waterRemaining>=8) {
                System.out.println("Filling cup with " + 8 + " cups of coffee.");
                cup.fill();
                waterRemaining-=8;
            } else if (waterRemaining>0) {
                System.out.println("Filling cup with " + waterRemaining + " cups of coffee.");
                cup.fill();
                waterRemaining = 0;
            } else {
                System.out.println("No water remaining in pot. Must be filled in coffee machine.");
            }
        }
    }
}
