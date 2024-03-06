package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 1000, 2);
        orders[1] = createOrder("옛날 두부", 5000, 5);
        orders[2] = createOrder("유기농 두부", 15000, 10);

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

