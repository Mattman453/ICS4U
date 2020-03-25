package app;

import mattj.Input;

/**
 *
 * @author Mr. Cutler
 */
public class CoffeeKlatch {
    static boolean inUse = true;

    public static void main(String[] args) {
        System.out.println("Hello user. For controls, read the controls.txt file. Basic controls will be shown in use.");
        CoffeeMachine machine = new CoffeeMachine();
        CoffeePot pot = new CoffeePot();
        CoffeeCup cup = null;
        while(inUse) {
            String word = Input.getWord().toLowerCase();
            switch (word) {
                case "grab":
                    cup = new CoffeeCup();
                    break;
                case "water":
                    machine.addWater();
                    break;
                case "beans":
                    machine.addBeans();
                    break;
                case "grind":
                    machine.grindBeans();
                    break;
                case "brew":
                    machine.brew(pot);
                    break;
                case "fill":
                    if (cup==null) {
                        System.out.println("Gotta grab your cup first.");
                    } else {
                        pot.pour(cup);
                    }
                    break;
                case "reset":
                    System.out.print("What new strength would you like? Suggestions (Strong, Regular, Weak): ");
                    machine.reset(Input.getWord());
                    break;
                case "end":
                    inUse = false;
                    break;
                default:
                    System.out.println("Unknown Command. Nothing will be performed this step.");
                    break;
            }
        }
    }

}
