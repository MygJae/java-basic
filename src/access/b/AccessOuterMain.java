package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default
//        data.defaultField = 2;
//        data.defaultMethod();

        // private
//        data.privateField = 3;
//        data.privateField();

        data.innerAccess();
    }


}

