package app;

public class Main {

    public static void main(String[] args) {
        Flight[] flights = new Flight[3];
        flights[0] = new Flight(100, "Toronto", "Cancun", 4.1);
        flights[1] = new Flight(200, "Toronto", "Paris", 6.3);
        flights[2] = new Flight(300, "Los Angeles", "Toronto", 5.7);
        double[] timeTaken = new double[2];
        timeTaken[0] = flights[2].connectFlights(flights[1]);
        timeTaken[1] = flights[2].connectFlights(flights[0]);
        if (timeTaken[0]<timeTaken[1]) {
            System.out.println("The first connection is shorter.");
        } else if (timeTaken[1]<timeTaken[0]) {
            System.out.println("The second connection is shorter.");
        } else {
            System.out.println("The connections take the same time.");
        }
    }
}
