package class1.ex;

import java.util.Scanner;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        /**
         * 온라인 상점의 주문 관리 시스템
         *   상품 주문 정보와 최종 금액 출력
         */


        ProductOrder[] order = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 100;
        order1.qty = 1;
        order[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "옛날 두부";
        order2.price = 2000;
        order2.qty = 5;
        order[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "유기농 두부";
        order3.price = 10000;
        order3.qty = 13;
        order[2] = order3;

        int amt = 0;
        for (ProductOrder productOrder : order) {
            amt += productOrder.price * productOrder.qty;
            System.out.println("제품: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.qty);
        }
        System.out.println("총액: " + amt);
    }


}

