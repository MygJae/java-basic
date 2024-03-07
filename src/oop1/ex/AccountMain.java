package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        /**
         * 객체 지향 계좌
         *   계좌에 10000원을 입금
         *   계좌에서 9000원을 출금
         *   계좌에서 2000원을 출금 시도 -> 잔액 부족 확인
         *   잔고를 출력
         */

        Account account = new Account();

        // 입금
        account.deposit(10000);

        // 출금
        account.withdraw(9000);

        // 잔액 부족
        account.withdraw(1000);

        // 잔고
        account.balance();
    }


}

