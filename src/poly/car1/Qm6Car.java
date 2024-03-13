package poly.car1;

public class Qm6Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Qm6Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Qm6Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Qm6Car.pressAccelerator");
    }


}

