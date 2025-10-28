package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단 : ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("결제 금액 : ");
            int amount = scanner.nextInt();

            scanner.nextLine();
            payService.processPay(payOption, amount);
        }


//        //naver 결제
//        String payOption2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(payOption2, amount2);
//
//        //잘못된 결제 수단 선택
//        String payOption3 = "bad";
//        int amount3 = 15000;
//        payService.processPay(payOption3, amount3);
//
//        String payOption4 = "new";
//        int amount4 = 20000;
//        payService.processPay(payOption4, amount4);
    }
}