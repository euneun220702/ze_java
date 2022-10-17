/*
서은경
*/
import java.util.Random;
import java.util.Scanner;

public class four_number {
  public static void main(String[] args) {
    System.out.println("[주민등록번호 계산]");
    Scanner scanner = new Scanner(System.in);

    System.out.printf("출생년도를 입력해 주세요.(yyyy): ");
    int year = scanner.nextInt();
    String str = Integer.toString(year);
    String year2 = str.substring(str.length()-2);

    System.out.printf("출생월을 입력해 주세요.(mm): ");
    int month = scanner.nextInt();

    System.out.printf("출생일을 입력해 주세요(dd): ");
    int day = scanner.nextInt();

    System.out.printf("성별을 입력해 주세요.(m/f): ");
    String sex = scanner.next();

    int mf = 0;
    if (year < 2000 && sex.equals("m")) {
        mf = 1;
    } else if (year < 2000 && sex.equals("f")){
        mf = 2;
    } else if (year >= 2000 && sex.equals("m")) {
        mf = 3;
    } else if (year >= 2000 && sex.equals("f")) {
        mf = 4;
    }

    System.out.print(year2 + String.format("%02d", month) + String.format("%02d", day) + "-" + mf);

    Random random = new Random();

    for(int i = 0; i <6; i++) {
        int value = random.nextInt(10-1);
        System.out.print(value);
    }
    System.out.println();
  }
}
