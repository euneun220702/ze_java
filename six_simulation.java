/*
서은경
다 못했어요. 할 수 있는데 까지 했습니다.
*/

import java.util.Random;
import java.util.Scanner;

public class six_simulation {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println(" ");
    int input = s.nextInt();

    int x = 10000;
    int y = 100;

    Random random = new Random();
    String[] name = {"이재명","윤석열","심상정","안철수"};

    double ran = Math.random();
    int num = (int)Math.round(ran * (name.length-1));

    System.out.println("[투표진행율]: "+String.format("%.2f",(input/(float)x)*y)+"%, "+input+"명 투표 => "+name[num]);

    String lee = "이재명";
    String yoon = "윤석열";
    String sim = "심상정";
    String an = "안철수";

    if(lee == name[num] && input < 10000){
       int lee_input = input;
        System.out.println("[기호:1] 이재명: "+"00.00%, "+"(투표수: "+lee_input+")");
        System.out.println("[기호:2] 윤석열: "+"00.00%, "+"(투표수: 0)");
        System.out.println("[기호:3] 심상정: "+"00.00%, "+"(투표수: 0)");
        System.out.println("[기호:4] 안철수: "+"00.00%, "+"(투표수: 0)");

    } else if (yoon == name[num] && input < 10000) {
        int yoon_input = input;
        System.out.println("[기호:1] 이재명: "+"00.00%, "+"(투표수: 0)");
        System.out.println("[기호:2] 윤석열: "+"00.00%, "+"(투표수: "+yoon_input+")");
        System.out.println("[기호:3] 심상정: "+"00.00%, "+"(투표수: 0)");
        System.out.println("[기호:4] 안철수: "+"00.00%, "+"(투표수: 0)");

    } else if (sim == name[num] && input < 10000) {
        int sim_input = input;
        System.out.println("[기호:1] 이재명: "+"00.00%, "+"(투표수: 0)");
        System.out.println("[기호:2] 윤석열: "+"00.00%, "+"(투표수: 0)");
        System.out.println("[기호:3] 심상정: "+"00.00%, "+"(투표수: "+sim_input+")");
        System.out.println("[기호:4] 안철수: "+"00.00%, "+"(투표수: 0)");

    } else if (an == name[num] && input < 10000) {
        int an_input = input;
        System.out.println("[기호:1] 이재명: " + "00.00%, " + "(투표수: 0)");
        System.out.println("[기호:2] 윤석열: " + "00.00%, " + "(투표수: 0)");
        System.out.println("[기호:3] 심상정: " + "00.00%, " + "(투표수: 0)");
        System.out.println("[기호:4] 안철수: " + "00.00%, " + "(투표수: " + an_input + ")");
    } else if (input == 10000) {
        System.out.println("[기호:1] 이재명: " + "00.00%, " + "(투표수: 0)");
    }

  }
}
