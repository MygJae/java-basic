package static2;

public class DecoData {
    private static int staticValue;
    private int instanceValue;

    // static -> static만 접근 가능
    public static void staticCall() {
        staticValue++;
        staticMethod();

//        instanceValue++;
//        instanceValue();
    }

    public static void staticCall(DecoData data) {
        staticValue++;
        staticMethod();
    }

    // 모두 접근 가능, DecoData 생략 가능
    public void instanceCall() {
        DecoData.staticValue++;
        DecoData.staticMethod();

        instanceValue++;
        instanceMethod();
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }


}

