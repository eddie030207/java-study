package ref.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        Scanner sc =  new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int orderNum = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[orderNum];
        sc.nextLine();
        // createOrder()를 여러 번 사용하여 상품 주문 정보들을 생성하고 배열에 저장
        for (int i = 0; i < orderNum; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");;
            String ProductName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();
            orders[i] = createOrder(ProductName, price, quantity);
        }

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        //getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        //총 결제 금액 출력
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    static ProductOrder createOrder(String ProductName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.ProductName = ProductName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 :" + order.ProductName + ", 가격 : " + order.price + ", 수량  : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price *  order.quantity;
        }
        return totalAmount;
    }
}
