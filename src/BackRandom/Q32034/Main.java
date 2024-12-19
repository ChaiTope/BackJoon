package BackRandom.Q32034;
//문제
//N개의 동전이 일렬로 놓여 있다. 각 동전은 앞면이나 뒷면이 보이도록 놓여 있다.
//
//당신은 다음의 조작을 원하는 만큼 반복할 수 있다.
//
//서로 이웃하면서 같은 면으로 놓여있는 두 개의 동전을 선택하여 둘 다 뒤집는다.
//앞면이 보이는 동전을 뒤집으면 뒷면이, 뒷면이 보이는 동전을 뒤집으면 앞면이 보이게 된다.
//
//각 동전의 상태가 주어질 때 모든 동전을 앞면이 보이도록 놓을 수 있는지 판단하고, 가능하다면 그렇게 하기 위해 필요한 조작의 최소 횟수를 구하시오.
//
//입력
//첫 줄에 테스트 케이스의 개수 T가 주어진다. (1 ≤ T ≤ 10,000)
//
//테스트 케이스의 첫 줄에는 동전의 개수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
//
//테스트 케이스의 둘째 줄에는 각 동전의 상태를 나타내는 길이 N의 문자열 S가 주어진다. 모든 1 ≤ i ≤ N에 대해, S의 i번째 문자는 i번째 동전이 앞면인 경우 H, 뒷면인 경우 T이다.
//
//모든 테스트 케이스에 대한 N의 총합은 1,000,000을 넘지 않는다.
//
//출력
//각 테스트 케이스에 대해, 주어진 상태에서 모든 동전을 앞면이 보이도록 하기 위해 필요한 조작의 최소 횟수를 한 줄에 출력한다. 불가능하다면 −1을 대신 출력한다.

//1. 첫 번째로 -- 몇번 할 건지 정함
//2. 두 번째로 첫 번째 케이스가 실행되고, -- 동전 갯수가 정해짐
//3. 세 번째로 첫 번째 케이스에 해당하는 -- 문자열이 입력됨(H는 앞면, T는 뒷면)
//4. 이 동전 중 이어진 두 동전을 뒤집을 수 있음
//5. 가능하면 조작의 최소 횟수를 출력, 불가능하면 -1을 출력

//카운트해야하는 경우
//TT, THHT, THTTHT
//연속된 T의 갯수가 짝수
//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = sc.nextInt(); //몇번 수행할지 정함
        for(int i = 0; i < a; i++){
            int b = sc.nextInt(); //해당 케이스의 동전 갯수를 정함
            String[] arr = sc.nextLine().split(" ");

            // 배열 내 객체 하나하나를 비교
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].equals(arr[j + 1])) { //배열의 값 하나하나 다음값이랑 비교
                    if (arr[j].equals("H")){ //만약 모든면이 H라면
                        System.out.println(count);
                    } else if (arr[j].equals("T")){ //만약 모든 면이 T라면
                        if(j % 2 == 1){ //그 중 T의 갯수가 홀수라면
                            System.out.println(-1); //무조건 실패
                        }
                    }
                }
            }

        }



        sc.close();
    }
}