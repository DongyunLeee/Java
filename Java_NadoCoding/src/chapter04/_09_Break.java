package chapter04;

public class _09_Break {
    public static void main(String[] args) {
        // Break
        // 치킨집에서 매일 20마리만 판매 (1인당 1마리 구매가능)
        // 손님 50명 대기중

        // For 문
        System.out.println("----- For 문 -----");
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if(i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        // While 문
        System.out.println("----- While 문 -----");
        int cnt = 1;
        while (cnt <= 50){
            System.out.println(cnt + "번 손님, 주문하신 치킨 나왔습니다.");
            if(cnt == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            cnt++;
        }
        System.out.println("영업을 종료합니다.");

    }
}
