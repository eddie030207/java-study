package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화!";

        // 영화 리뷰 정보 출력
        System.out.println("제목 : " + inception.title + ", 평가 : " + inception.review);
        System.out.println("제목 : " + aboutTime.title + ", 평가 : " + aboutTime.review);
    }
}
