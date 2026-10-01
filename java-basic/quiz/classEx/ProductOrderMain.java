package quiz.classEx;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "콜라";
        product2.price = 1500;
        product2.quantity = 1;

        ProductOrder[] products = new ProductOrder[] {product1, product2};

        int total = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.productName +
            ", 가격: " + product.price + 
            ", 수량: " + product.quantity);
            total += (product.price * product.quantity);
        }
        System.out.println("총 결제 금액: " + total);
    }
}
