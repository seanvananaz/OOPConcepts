package looseCoupling;

public class Motorbike implements Transport {

    @Override
    public void go() {
        System.out.println("Trip started using Motorbike");
    }
}
