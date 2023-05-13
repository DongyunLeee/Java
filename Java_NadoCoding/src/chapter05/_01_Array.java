package chapter05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "카페라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + "  하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요.\n");

        // 배열 선언 방법 1
        String[] coffees = new String[4];

        // 배열 선언 방법 2
//        String coffees[] = new String[4];

        // 배열 선언 방법 3
//        String[] coffees[] = new String[] {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        // 배열 선언 방법 4
//        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "카페라떼";
        coffees[3] = "카푸치노";

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
    }
}
