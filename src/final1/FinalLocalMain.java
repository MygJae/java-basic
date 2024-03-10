package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역변수 최초 1회 할당만 가능
        final int data1;
        data1 = 10;
//        data1 = 20;

        // final 지역변수 최초 1회 할당만 가능
        final int data2;
        data2 = 10;
//        data2 = 20;
        method(10);
    }

    // final 매개변수 parameter 받은 값 수정 x
    static void method(final int parameter) {
//        parameter = 20;
    }


}

