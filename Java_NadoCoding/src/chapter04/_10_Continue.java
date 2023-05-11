package chapter04;

public class _10_Continue {
    public static void main(String[] args) {
        // Continue

        // 하루에 20마리만 파는 치킨집 (1인당 1마리 구매가능)
        // 대기손님은 50명
        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For 문
        System.out.println("----- For 문 -----");
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noshow = 17; // 노쇼 고객 순번(17번)
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if (i == noshow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        // While 문
        System.out.println("----- While 문 -----");
        int index = 0;
        sold = 0;
        while(index < 50) {
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            if (index == noshow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
