package quiz.extends1;

public class Item {
    protected String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }
}
