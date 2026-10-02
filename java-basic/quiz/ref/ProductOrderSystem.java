package quiz.ref;

import java.util.Scanner;

public class ProductOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCnt = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[orderCnt];

        orders = orderMain(orderCnt, orders, scanner);

        System.out.println("주문 정보를 출력합니다.");
        printOrder(orders);

    }

    static ProductOrder[] orderMain(int orderCnt, ProductOrder[] orders, Scanner scanner) {
        for (int i = 0; i < orderCnt; i++) {
            
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            ProductOrder product = new ProductOrder();
            System.out.print("상품명: ");
            product.productName = scanner.next();
            System.out.print("가격: ");
            product.price = scanner.nextInt();
            System.out.print("수량: ");
            product.quantity = scanner.nextInt();

            orders[i] = product;
        }
        return orders;
    }
    static void printOrder(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.println(
                "상품명: " + order.productName +
                " 가격: " + order.price +
                " 수량: " + order.quantity
            );
            totalPrice += getTotalAmount(order);
        }
        System.out.println("총 주문 금액: " + totalPrice);
    }
    static int getTotalAmount(ProductOrder order) {
        return (order.price * order.quantity);
    }

}
