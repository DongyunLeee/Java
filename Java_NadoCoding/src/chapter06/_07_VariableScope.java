package chapter06;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(number);
    }


    public static void methodB() {
        int result = 1;
    }


    public static void main(String[] args) {
        // 지역변수 : 메소드 내에서만 사용 가능
        int number = 3;
//        System.out.println(number);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);
    }
}
