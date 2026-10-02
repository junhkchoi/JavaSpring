package quiz.ref;

import java.util.Scanner;

public class ProductOrderMain_Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ProductOrder product1 = createProduct("두부", 2000, 2);
        ProductOrder product2 = createProduct("콜라", 1500, 3);

        ProductOrder[] products = new ProductOrder[] {product1, product2};

        printOrder(products);
        int total = getTotalAmount(products);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }
    static void printOrder(ProductOrder[] products) {
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.productName +
            ", 가격: " + product.price + 
            ", 수량: " + product.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] products) {
        int total = 0;
        for (ProductOrder product : products) {
            total += (product.price * product.quantity);
        }
        return total;
    }
}
