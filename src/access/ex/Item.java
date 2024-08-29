package access.ex;

public class Item {
   // 데이터는 private
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getTotalPrice(){
        return price * quantity;
    }
}
