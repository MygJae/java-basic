package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); // 상속 받으면 반듯이 오버라이딩 해야함, 혹은 abstract로 받아야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }


}

