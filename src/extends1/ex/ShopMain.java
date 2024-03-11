package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {
        /**
         * 상속 관계 상품
         *   Book, Album, Movie
         *   코드 중복이 없게 상속 사용. 부모 클래스 Item
         *   공통 속성: name, price
         *   Book: 저자 author, isbn isbn
         *   Album: 아티스트 artist
         *   Movie: 감독 director, 배우 actor
         */

        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000,"감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();

        System.out.println("상품 가격의 합: " + sum);
    }


}

