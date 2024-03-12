package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw(), };

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }


}

