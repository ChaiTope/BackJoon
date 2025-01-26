package BackIf.Q2525;

//문제
//KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는
// 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
//
//또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
//
//훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
//두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
//
//출력
//첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);

        int b = sc.nextInt();
        if(m + b < 60){
            System.out.println(n + " " + (m + b));
        } else if(m + b >= 60){ // 두 분을 합친게 60보다 크면
            int d = ((m + b) % 60); // d에 두 분을 합친 값을 60으로 나눈 나머지값을 넣음
            if((m + b) / 60 > 1) { // 두 분을 합친값을 60으로 나눈 값이 1보다 크면
                int c = ((m + b) / 60); // c에 두 분을 합친 값을 60으로 나눈값을 넣음
                if((n + c) < 24) { // 만약 두 시를 합친값이 24시간 이내라면
                    System.out.println((n + c) + " " + d);
                }else{ // 두 시를 합친값이 24시간을 초과하면
                    System.out.println((n + c - 24) + " " + d);
                }
            }else{ //두 분을 합친 값을 60으로 나눈값이 1보다 작으면
                if((n + 1) < 24){
                    System.out.println((n + 1) + " " + d);
                }else{
                    System.out.println(0 + " " + d);
                }
            }
        }
        sc.close();
    }
}

//CHAT GPT가 준 개선코드
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] a = s.split(" ");
//        int n = Integer.parseInt(a[0]); // 현재 시
//        int m = Integer.parseInt(a[1]); // 현재 분
//        int b = sc.nextInt(); // 추가할 분
//
//        // 전체 분 계산
//        int totalMinutes = m + b;
//        int addedHours = totalMinutes / 60; // 추가된 시간
//        int remainingMinutes = totalMinutes % 60; // 나머지 분
//        int finalHour = (n + addedHours) % 24; // 24시간 순환 처리
//
//        // 결과 출력
//        System.out.println(finalHour + " " + remainingMinutes);
//
//        sc.close();
//    }
//}