package extends1.ex;

public class Album extends Item{
    /**
     * 상속 관계 상품
     *   Book, Album, Movie
     *   코드 중복이 없게 상속 사용. 부모 클래스 Item
     *   공통 속성: name, price
     *   Album: 아티스트 artist
     */

    public String artist;

    public Album(String name, int price, String artist) {
        super.name = name;
        super.price = price;
        this.artist = artist;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
        System.out.println("- 아티스트: " + artist);
    }


}

