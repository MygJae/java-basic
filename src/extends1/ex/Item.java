package extends1.ex;

public class Item{
    /**
     * 상속 관계 상품
     *   Book, Album, Movie
     *   코드 중복이 없게 상속 사용. 부모 클래스 Item
     *   공통 속성: name, price
     *   Book: 저자 author, isbn isbn
     */

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    public int getPrice() {
        return price;
    }


}

