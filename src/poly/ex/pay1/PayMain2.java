package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        /**
         * 결제 시스템 개발
         *   현재 2가지 결제 수단을 지원
         *   5개의 결제 수단을 추가
         *   기존 코드를 리펙토링해라
         * OCP 원칙 지키기
         */

        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("결제 수단을 입력하세요(종료 exit): ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료합니다.");
                return;
            }

            System.out.print("가격을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }
    }


}

