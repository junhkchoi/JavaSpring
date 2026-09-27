package quiz.array;
import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productCnt = 0;
        String[] productNames = new String[1];
        int[] productPrices = new int[1];

        System.out.println("상품 등록 프로그램입니다");
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    if (productCnt == productNames.length) {
                        System.out.println("더 이상 등록할 수 없습니다");
                        break;
                    }
                    System.out.print("상품 이름을 입력: ");
                    productNames[productCnt] = scanner.nextLine();

                    System.out.print("상품 가격을 입력: ");
                    productPrices[productCnt] = scanner.nextInt();
                    
                    productCnt++;
                    break;

                case 2:
                    if (productCnt == 0) {
                        System.out.println("등록된 상품이 없습니다");
                    }
                    for(int i = 0; i < productCnt; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
            
        }
    }    
}
