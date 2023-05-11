package chapter04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do While
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리
        int height = 2; // 키 2m
        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        // 키가 25m인 경우
        move = 0;
        height = 25; // 키 25m
        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("---------- 반복문 #2 -----------");
        // Do While 반복문 -> 조건보다 먼저 실행(최소 1회 실행 보장)
        move = 0;
        height = 25;
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);

    }
}
