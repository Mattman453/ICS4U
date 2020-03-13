package app;

/**
 *
 * @author Mr. Cutler
 */
public class CoffeeKlatch {


    public static void main(String[] args) {

        // Create a new app.CoffeeMachine and make the variable refer to it.

        CoffeeMachine machine = new CoffeeMachine();

        // Add water and beans to the app.CoffeeMachine.
        machine.addWater();
        machine.addBeans();

        // Get ready to grind some strong coffee in the app.CoffeeMachine.
        //machine.setStrength("Strong");

        // Grind the beans.
        machine.grindBeans();

        // Create a new CoffeeCup and make the variable refer to it.
        CoffeeCup cup = new CoffeeCup();

        // Have your app.CoffeeMachine brew coffee into the coffee cup.
        machine.brew(cup);

        // Drink from the cup.
        cup.drink();

        // Try to drink again --the cup is now empty.
        cup.drink();

        // Declare ANOTHER coffee cup reference and initialize it.
        CoffeeCup cup2 = new CoffeeCup();

        // Brew coffee into the new cup.
        machine.brew(cup2);

        // Try to drink from the first cup --it's still empty!
        cup.drink();

        // Drink from the second cup.
        cup2.drink();

        // Print a sigh of satisfaction.
        System.out.println("*satisfied sigh*");
    }

}
