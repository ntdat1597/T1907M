package kiemtra;

public class Flight {
    private int number;
    private String destination;

    public Flight() {

    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void display() {
        System.out.println("Flight Number is :" + getNumber());
        System.out.println("Flight Destination is :" + getDestination());
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public static void main(String[] args) {
        Flight flight = new Flight(858, "Paris");
        flight.display();

    }
}
