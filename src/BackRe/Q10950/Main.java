package BackRe.Q10950;
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextLine();
        }

        for(int i = 0; i < arr.length; i++){
            String[] split = arr[i].split(" ");
            for(int j = 0; j < split.length/2; j++){
                System.out.print(parseInt(split[j*2]) + parseInt(split[j*2+1]));
                System.out.print("\n");
            }
        }
        sc.close();
    }
}
