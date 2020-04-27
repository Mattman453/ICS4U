package app;

public class Flight {
    private int flightNo;
    private String departure;
    private String destination;
    private double duration;

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double connectFlights(Flight connectingFlight) {
        String sentence = departure + " to " + connectingFlight.getDestination() + " will take " + (duration+connectingFlight.getDuration()) + " hours.";
        System.out.println(sentence);
        return duration+connectingFlight.getDuration();
    }

    public Flight(int flightNo, String departure, String destination, double duration) {
        this.flightNo = flightNo;
        this.departure = departure;
        this.destination = destination;
        this.duration = duration;
    }
}
