package looseCoupling;

public class Person {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport motorbike = new Motorbike();
        TravelInterface trip = new Travel(car);
        trip.start();

    }
}
