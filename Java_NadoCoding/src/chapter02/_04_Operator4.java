package chapter02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        // || = or, && = and
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // true

        // or 연산
        System.out.println((5 > 3) || (3 < 1)); // true
        System.out.println((5 < 3) || (3 < 1)); // false

        // and 연산
        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 > 3)); // false
        System.out.println(!(5 < 3)); // true
    }
}
