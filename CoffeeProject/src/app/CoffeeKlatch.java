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
            System.out.println("Status: " + machine.getStatus().toString() + "Commands available are:");
            System.out.println("grab(get a cup), water(fill machine with water), beans(add beans to machine), grind(get beans in proper condition),");
            System.out.print("brew(make the coffee), pour(fill your cup): ");
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
        System.out.println("Goodbye.");
    }

}
