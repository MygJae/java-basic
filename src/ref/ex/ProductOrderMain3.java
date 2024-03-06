package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int qty = scanner.nextInt();
            scanner.nextLine();//입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, qty);
        }
        printOrders(orders);

        int totalAmt = gettotalAmt(orders);
        System.out.println("총액: " + totalAmt);
    }

    static ProductOrder createOrder(String productName, int price, int qty) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.qty = qty;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.qty);
        }
    }

    static int gettotalAmt(ProductOrder[] orders) {
        int totalAmt = 0;
        for (ProductOrder order : orders) {
            totalAmt += order.price * order.qty;
        }
        return totalAmt;
    }


}

