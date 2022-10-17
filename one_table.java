/*
서은경
*/
public class one_table {
public static void main(String[] args) {
    System.out.print("[구구단 출력]");
    System.out.println();
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            System.out.print("0"+ j + " x " + "0"+ i + " = " + String.format("%02d", i * j));
            System.out.print("    ");
        }
        System.out.println();
    }
}
}
