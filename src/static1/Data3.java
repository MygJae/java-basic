package static1;

public class Data3 {
    //맴버 변수 -> 인스턴스 변수, 클래스 변수
    public String name; // 인스턴스 변수
    public static int count; // 클래스 변수 static -> 메서드 영역에서 관리, 공용변수로 사용.

    public Data3(String name) {
        this.name = name;
        count++;
    }


}

