package looseCoupling;

public class Car implements Transport {

    @Override
    public void go() {
        System.out.println("Trip started using Car");
    }
}
