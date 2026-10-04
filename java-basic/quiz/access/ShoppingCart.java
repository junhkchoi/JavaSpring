package quiz.access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        // if (itemCount < 10) {
        //     items[itemCount] = item;
        //     itemCount++;    
        // } else {
        //     System.out.println("장바구니가 가득 찼습니다");
        // }
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
            items[itemCount] = item;
            itemCount++;
        
    }
    public void displayItems() {
        // int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            // total += items[i].totalPrice();
            System.out.println("상품명: " + items[i].itemInfo() + "| 합계: " + items[i].calcPrice());
        }
        // System.out.println("가격 전체 합: " + total);
        totalPrice();
    }

    private void totalPrice() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].calcPrice();
        }
        System.out.println("가격 전체 합: " + total);
    }
}
