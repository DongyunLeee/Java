package chapter06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }


    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        // 메소드 오버로딩 : 같은 이름의 메소드
        // 1. 매개변수의 타입이 다른 경우
        // 2. 매개변수의 개수가 다른 경우
        // 단, 반환값은 상관없음
        System.out.println(getPower(3));
        System.out.println(getPower("4"));

        System.out.println(getPower(3, 3));
    }
}
