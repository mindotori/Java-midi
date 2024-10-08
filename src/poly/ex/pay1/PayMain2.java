package poly.ex.pay1;

import java.util.Scanner;
//예제를 스캐너로 변경
public class PayMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while(true){
            System.out.print("결제 수단을 입력하세요:");
            String payOption = sc.nextLine();

            if(payOption.equals("exit")){
                System.out.print("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요:");
            int amount = sc.nextInt();
            sc.nextLine(); //개행

            payService.processPay(payOption, amount);

        }
    }
}
