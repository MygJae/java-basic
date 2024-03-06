package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        /**
         * 영화 리뷰 정보를 관리
         */

        MovieReview pianistLegend = new MovieReview();
        pianistLegend.title = "피아니스트의 전설";
        pianistLegend.review = "나인틴 헌드레드";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "어? ";

        System.out.println("영화 제목: " + pianistLegend.title + ", 리뷰: " + pianistLegend.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }


}

