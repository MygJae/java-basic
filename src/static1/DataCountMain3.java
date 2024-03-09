package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Data3 data1 = new Data3("A");
        System.out.println("A.count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B.count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C.count = " + Data3.count);

        // static -> 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 인스턴스로 갔다가 static를 인식해서 메서드영역으로 감. 가능은 하지만 권장 X

        // static -> 클래스를 통한 접근
        System.out.println(Data3.count);
    }


}

