package poly.basic;

// 다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) { // Child = new Parent(),new Child() -> instanceof 담을 수 있냐는 의미
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent).childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }


}

