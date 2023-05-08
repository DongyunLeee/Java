package chapter02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean bool = (x == y) ? true : false;
        System.out.println(bool); // false

        String str = (x != y) ? "달라요." : "같아요.";
        System.out.println(str); // 달라요.
    }
}
