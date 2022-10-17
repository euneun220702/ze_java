/*
서은경
다 못했습니다.
*/

import java.util.Scanner;

public class eight_income {
  public static void main(String[] args) {
    Scanner sc = new Scanner([System.in](http://system.in/));
                                     System.out.println("[과세금액 계산 프로그램]");
    System.out.printf("연소득을 입력해 주세요: ");
    int money = sc.nextInt();

    if(money <= 12000000){
        int a = money/100*6;
        System.out.println(money+" * 6% = "+a );
        System.out.println(" ");
        System.out.println("[세율에 의한 세금]: "+a);
        System.out.println("[누진공제 계산에 의한 세금]: 0");

    } else if (money > 12000000 && money <= 46000000) {
        System.out.println("");
    }
  }
}
