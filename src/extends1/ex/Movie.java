package extends1.ex;

public class Movie extends Item{
    /**
     * 상속 관계 상품
     *   Book, Album, Movie
     *   코드 중복이 없게 상속 사용. 부모 클래스 Item
     *   공통 속성: name, price
     *   Movie: 감독 director, 배우 actor
     */

    public String director;
    public String actor;

    public Movie(String name, int price, String director, String actor) {
        super.name = name;
        super.price = price;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }


}

