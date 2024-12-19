package BackIf.Q1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = -10000, d = 10000;

        // 조건문 실행
        if (a >= c && a < d && b >= c && b < d) {
            if (a < b) {
                System.out.println("<");
            } else if (a > b) {
                System.out.println(">");
            } else {
                System.out.println("==");
            }
        } else {
            System.out.println("올바르지 않은 값");
        }
        sc.close();
    }
}
