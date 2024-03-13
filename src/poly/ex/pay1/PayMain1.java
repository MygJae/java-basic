package poly.ex.pay1;

public class PayMain1 {

    public static void main(String[] args) {
        /**
         * 결제 시스템 개발
         *   현재 2가지 결제 수단을 지원
         *   5개의 결제 수단을 추가
         *   기존 코드를 리펙토링해라
         * OCP 원칙 지키기
         */

        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        //new 결제
        String payOption4 = "new";
        int amount4 = 25000;
        payService.processPay(payOption4, amount4);
    }


}

