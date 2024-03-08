package access.ex;

public class ShoppingCart {
    /**
     * 쇼핑 카트
     * 장바구니에는 상품을 최대 10개만
     */

    private int count;
    private Item[] items = new Item[10];

    public void addItem(Item item) {
        if(count >= items.length) {
            System.out.println("장바구니 초과 되었습니다.");
            return;
        }

        items[count++] = item;
    }

    public void displayItems() {
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getItemName() + "합계: " + item.getSum());
        }
        System.out.println("총액: " + totalPrice());
    }

    private int totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            totalPrice += item.getSum();
        }
        return totalPrice;
    }

}

