package chapter04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        for (int i = 0; i < 10; i++) {
            System.out.println("test " + i);
        }

        // 짝수 출력
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // 홀수 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 숫자 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
