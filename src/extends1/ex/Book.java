package extends1.ex;

public class Book extends Item{

    /**
     * 상속 관계 상품
     *   Book, Album, Movie
     *   코드 중복이 없게 상속 사용. 부모 클래스 Item
     *   공통 속성: name, price
     *   Book: 저자 author, isbn isbn
     */

    public String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super.name = name;
        super.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
        System.out.println("- 저자: " + author + ", isbn: " + isbn );
    }


}

