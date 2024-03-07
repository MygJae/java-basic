package oop1.ex;

public class Rectangle {
    /**
     * 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
     *   속성과 기능
     */

    int width;
    int height;

    //넓이
    int calculateArea() {
        return width * height;
    }

    //둘레 길이
    int calculatePerimeter() {
        return 2 * (width + height);
    }

    //정사각형 여부
    boolean isSquare() {
        return width == height;
    }

}

