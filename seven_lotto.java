/*
서은경
다 못했어요. 할 수 있는데 까지 했습니다.
*/

import java.util.Arrays;
import java.util.Scanner;

public class seven_lotto {
public static void main(String[] args) {
System.out.println("[로또 당첨 프로그램]");
  Scanner sc = new Scanner(System.in);

    System.out.printf("로또 개수를 입력해 주세요.(숫자 1 ~ 10): ");
    int number = sc.nextInt();

    for (int a = 1; a <= number; a++) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1;
        int temp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        System.out.print((char) (65 + a - 1) + " ");
        for (int i = 0; i < 6; i++) {
            System.out.printf(ball[i] + ",");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println("[로또 발표]");
    int[] ball2 = new int[45];

    for (int i = 0; i < ball2.length; i++)
        ball2[i] = i + 1;
    int temp = 0;
    int j = 0;

    for (int i = 0; i < 6; i++) {
        j = (int) (Math.random() * 45);
        temp = ball2[i];
        ball2[i] = ball2[j];
        ball2[j] = temp;
    }
    System.out.print("  ");
    for (int i = 0; i < 6; i++) {
        System.out.printf(ball2[i] + ",");
    }
    System.out.println();
    System.out.println();
    System.out.println("[내 로또 결과]");


}
}
