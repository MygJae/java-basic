package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        /**
         * RectangleProceduralMain -> 객체 지향으로 변경하기
         *   직사각형의 넓이 Area, 둘레 길이 Perimeter, 정사각형 여부 square
         */

        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }


}

