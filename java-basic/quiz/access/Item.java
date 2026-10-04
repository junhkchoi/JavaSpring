package quiz.access;

public class Item {
    private String name;
    private int price;
    private int quantity;


    Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String itemInfo() {
        return name;
    }
    
    int calcPrice() {
        return price * quantity;
    }

}
