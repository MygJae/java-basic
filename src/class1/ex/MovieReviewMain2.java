package class1.ex;

public class MovieReviewMain2 {
    /**
     * 영화 리뷰 정보를 관리
     *   배열 도입, 영화 리뷰를 배열에 관리
     *   출력 for문 사용
     */
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview pianistLegend = new MovieReview();
        pianistLegend.title = "피아니스트의 전설";
        pianistLegend.review = "나인틴 헌드레드";
        reviews[0] = pianistLegend;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "어? ";
        reviews[1] = aboutTime;

        for (MovieReview r : reviews) {
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }
    }


}

