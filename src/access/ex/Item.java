package access.ex;

public class Item {

    private String ItemName;
    private int price;
    private int qty;

    public Item(String itemName, int price, int qty) {
        this.ItemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getSum() {
        return price * qty;
    }


}

