package poly.basic;

// 업 캐스팅 vs 다운 캐스팅
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child; //업 캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }


}

