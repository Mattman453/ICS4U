package app;
/* A fancy coffee maker.  Makes coffee of varying strengths. */


import mattj.Input;

/**
 *
 * @author Mr. Cutler
 */
public class CoffeeMachine {

    // The current strength of the coffee.
    private Strength strength;
    private BrewStatus status = BrewStatus.NOTHING;
    private int waterRemaining = 0;

    public int getWaterRemaining() {
        return waterRemaining;
    }

    public void setWaterRemaining(int waterRemaining) {
        this.waterRemaining = waterRemaining;
    }

    public BrewStatus getStatus() {
        return status;
    }

    public void setStatus(BrewStatus status) {
        this.status = status;
    }

    /**
     * Set the strength of the Coffee to s; affects the fineness of the
     * grind.
     * "Weak", "Regular", "Strong" are the usual options for s, but you can
     * try others.
     * @param strength Text Description of Strength
     */
    public void setStrength(String strength) {
        strength = strength.toLowerCase();
        if (strength.contains("s")) {
            this.strength = Strength.STRONG;
        } else if (strength.contains("r")) {
            this.strength = Strength.REGULAR;
        } else if (strength.contains("w")) {
            this.strength = Strength.WEAK;
        } else if (strength.contains("d")) {
            this.strength = Strength.DEADLY;
        } else {
            this.strength = Strength.WEAK;
        }
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public Strength getStrength() {
        return strength;
    }

    /**
     * Grind the beans for the coffee
     */
    public void grindBeans() {
        if (status==BrewStatus.MIXED) {
            System.out.println("Grinding beans for " + strength + " coffee.");
            status = BrewStatus.GRINDED;
        } else if (status==BrewStatus.GRINDED) {
            System.out.println("Beans are already grinded for " + strength + " strength. Change requires a reset.");
        } else {
            System.out.println("Machine is not ready. Currently at " + status + " step. Must be mix of beans and water.");
        }
    }

    public void reset(String strength) {
        status = BrewStatus.NOTHING;
        setStrength(strength);
    }

    /**
     * Brew the coffee into given cup c
     * @param pot The cup of coffee to be filled
     */
    public void brew(CoffeePot pot) {
        if (status==BrewStatus.GRINDED) {
            System.out.print("Brewing coffee of strength ");
            System.out.print(strength);
            System.out.println(" into coffee pot.");
            if(waterRemaining>10) {
                pot.fill();
                setWaterRemaining(waterRemaining-10);
            } else if (waterRemaining>0) {
                pot.fill(waterRemaining);
                setWaterRemaining(0);
                status = BrewStatus.BEANS;
                System.out.println("No water remaining. Add water then grind beans to continue brewing.");
            } else {
                System.out.println("No water remaining.");
            }

        } else {
            System.out.println("Machine is not ready. Currently on " + status + " step. Required step is grinded.");
        }
    }

    /**
     * Add water to the machine reservoir
     */
    public void addWater() {
        if (status==BrewStatus.NOTHING) {
            status = BrewStatus.WATER;
            System.out.println("Adding Water");
            setWaterRemaining(40);
        } else if (status==BrewStatus.BEANS) {
            status = BrewStatus.MIXED;
            System.out.println("Adding Water");
        } else {
            System.out.println("Water has already been added.");
        }
    }

    /**
     * Add Beans to the Machine
     */
    public void addBeans() {
        if (status==BrewStatus.NOTHING) {
            status = BrewStatus.BEANS;
            System.out.println("Adding Beans");
        } else if (status==BrewStatus.WATER) {
            status = BrewStatus.MIXED;
            System.out.println("Adding Beans");
        } else {
            System.out.println("Beans have already been added.");
        }
    }

    public CoffeeMachine() {
        System.out.print("What Strength Would You Like? Suggestions are\nStrong, Regular, Weak: ");
        setStrength(Input.getLine());
    }
}
