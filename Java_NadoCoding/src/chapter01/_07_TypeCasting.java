package chapter01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환(TypeCasting) : 자료형을 변환하는 과정

        // int -> float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double -> int
        float score_f = 93.3F;
        double score_d = 94.5;
        System.out.println(score_f);
        System.out.println((int)score_f);
        System.out.println(score_d);
        System.out.println((int)score_d);

        // int -> long -> float -> double (자동 형변환)
        // double -> float -> long -> int (수동 형변환)


        // int to string
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        // float to string
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // string to int
        int i = Integer.parseInt("93");
        System.out.println(i);

        // string to double
        double d = Double.parseDouble("98.8");
        System.out.println(d);

  /*      int error = Integer.parseInt("93.3");
        System.out.println(error);*/
    }
}
