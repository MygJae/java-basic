package static2.ex;

public class Car {

    private static int totalCars;
    private String name;


    public Car(String name) {
        System.out.println("챠량 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("총 수량: " + totalCars);
    }


}

