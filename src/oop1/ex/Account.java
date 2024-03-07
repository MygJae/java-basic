package oop1.ex;

public class Account {
    /**
     * 객체 지향 계좌
     *   은행 계좌를 객체로 설계
     *   잔액 balance, 입금 deposit, 출금 withdraw
     */

    int balance;

    void deposit(int amount) {
        System.out.println("입금 되었습니다." + amount);
        balance += amount;
        System.out.println("현재 잔액: " + balance);
        System.out.println("=======================");
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족: " + (balance - amount));
            System.out.println("현재 잔액: " + balance);
            System.out.println("=======================");
            return;
        }

        System.out.println("출금 되었습니다." + amount);
        balance -= amount;
        System.out.println("현재 잔액: " + balance);
        System.out.println("=======================");
    }

    void balance() {
        System.out.println("현재 잔액: " + balance);
        System.out.println("=======================");
    }


}

